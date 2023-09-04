SUMMARY = "Extra Chinese table input methods for Fcitx5"
DESCRIPTION = "fcitx-table-extra provides extra table for Fcitx, including Boshiamy, Zhengma, Cangjie, and Quick."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "5.1.0"

RPM_NAME = "fcitx5-table-extra-5.1.0-1.1.noarch.rpm"
RPM_HASH = "e2de0ec2785855d20443c768989c60297e6bdcc8ff0e08001147afbf0f1e4d5ead61107c7f06c4b255928db2054d31459968b92233dd1a5c6da0c327112274fe"
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
fcitx5-table-extra"

RDEPENDS:${PN} += "fcitx5"

inherit rpm
