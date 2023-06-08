SUMMARY = "Extra Chinese table input methods for Fcitx5"
DESCRIPTION = "fcitx-table-extra provides extra table for Fcitx, including Boshiamy, Zhengma, Cangjie, and Quick."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "5.0.12"

RPM_NAME = "fcitx5-table-extra-5.0.12-1.2.noarch.rpm"
RPM_HASH = "93f3d1daf84d555f2f62ab78d5bd12b4e04cd676be23dd09c6a9454bb8e0e1adf964a2be1810b7757df5ba4b050d9817ab9e3c2ed7361df8994e27c668d36deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-cantonese fcitx-table-cn-wu fcitx-table-cn-wubi-large fcitx-table-cn-zhengma fcitx-table-cn-zhengma-large fcitx-table-extra-lang fcitx-table-hk-cantonese fcitx-table-hk-jyutping fcitx-table-hk-stroke5 fcitx-table-t9 fcitx-table-tw-array30 fcitx-table-tw-array30-large fcitx-table-tw-boshiamy fcitx-table-tw-cangjie-large fcitx-table-tw-cangjie3 fcitx-table-tw-cangjie5 fcitx-table-tw-easy-large fcitx-table-tw-quick-classic fcitx-table-tw-quick3 fcitx-table-tw-quick5 fcitx-table-tw-smart-cangjie6 fcitx5-table-extra metainfo() metainfo(org.fcitx.Fcitx5.Addon.TableExtra.metainfo.xml)"
RDEPENDS:${PN} += "fcitx5"

inherit rpm
