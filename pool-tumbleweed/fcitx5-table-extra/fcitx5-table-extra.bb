SUMMARY = "Extra Chinese table input methods for Fcitx5"
DESCRIPTION = "fcitx-table-extra provides extra table for Fcitx, including Boshiamy, Zhengma, Cangjie, and Quick."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "5.0.13"

RPM_NAME = "fcitx5-table-extra-5.0.13-1.1.noarch.rpm"
RPM_HASH = "f1616fafe16685ae3ba859a4084ec3d42ad79d74859848076a62a8d98c7851680524af1b4ccfbacb995e482ea41a95f46a4c39db32810f01a53eeec2b227d316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-cantonese \
fcitx-table-cn-wu \
fcitx-table-cn-wubi-large \
fcitx-table-cn-zhengma \
fcitx-table-cn-zhengma-large \
fcitx-table-extra-lang \
fcitx-table-hk-cantonese \
fcitx-table-hk-jyutping \
fcitx-table-hk-stroke5 \
fcitx-table-t9 \
fcitx-table-tw-array30 \
fcitx-table-tw-array30-large \
fcitx-table-tw-boshiamy \
fcitx-table-tw-cangjie-large \
fcitx-table-tw-cangjie3 \
fcitx-table-tw-cangjie5 \
fcitx-table-tw-easy-large \
fcitx-table-tw-quick-classic \
fcitx-table-tw-quick3 \
fcitx-table-tw-quick5 \
fcitx-table-tw-smart-cangjie6 \
fcitx5-table-extra \
metainfo() \
metainfo(org.fcitx.Fcitx5.Addon.TableExtra.metainfo.xml)"
RDEPENDS:${PN} += "fcitx5"

inherit rpm
