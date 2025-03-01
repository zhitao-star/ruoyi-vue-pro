package cn.iocoder.yudao.module.member.service.level;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.member.controller.admin.level.vo.experience.MemberExperienceRecordPageReqVO;
import cn.iocoder.yudao.module.member.dal.dataobject.level.MemberExperienceRecordDO;
import cn.iocoder.yudao.module.member.enums.MemberExperienceBizTypeEnum;

import java.util.Collection;
import java.util.List;

/**
 * 会员经验记录 Service 接口
 *
 * @author owen
 */
public interface MemberExperienceRecordService {

    /**
     * 获得会员经验记录
     *
     * @param id 编号
     * @return 会员经验记录
     */
    MemberExperienceRecordDO getExperienceRecord(Long id);

    /**
     * 获得会员经验记录列表
     *
     * @param ids 编号
     * @return 会员经验记录列表
     */
    List<MemberExperienceRecordDO> getExperienceRecordList(Collection<Long> ids);

    /**
     * 获得会员经验记录分页
     *
     * @param pageReqVO 分页查询
     * @return 会员经验记录分页
     */
    PageResult<MemberExperienceRecordDO> getExperienceRecordPage(MemberExperienceRecordPageReqVO pageReqVO);

    /**
     * 根据业务类型, 创建 经验变动记录
     *
     * @param userId          会员编号
     * @param experience      变动经验值
     * @param totalExperience 会员当前的经验
     * @param bizType         业务类型
     * @param bizId           业务ID
     */
    void createExperienceRecord(Long userId, Integer experience, Integer totalExperience,
                                MemberExperienceBizTypeEnum bizType, String bizId);
}
