SUMMARY = "Wubi and pinyin(wubi-pinyin) table for fcitx"
DESCRIPTION = "Fcitx Wubi (Wu Bi Zi Xing) and Pinyin mixed input tables for Simplified Chinese. \
 \
Wubi in Fcitx is based on wubi x86."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-wubi-pinyin-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "09a753d9d70029b4980f6dee2f6bb1db5ac7fc4819ebdfcdb2d667c54ddcda9e76922e21f8baca49b38eeb92ef8b385b25b3ddf32cc456988c2680f8f868dcf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-wubi-pinyin \
locale-fcitx-table-zh-CN;"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
