SUMMARY = "Wubi and pinyin(wubi-pinyin) table for fcitx"
DESCRIPTION = "Fcitx Wubi (Wu Bi Zi Xing) and Pinyin mixed input tables for Simplified Chinese. \
 \
Wubi in Fcitx is based on wubi x86."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-wubi-pinyin-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "f891652220dbd03c611a483e3d1734e7d94b7555ec537b3301dfdd127593569e43e7a35c4e4a692f938cbddbc50ea294a06b718c33b4a3615e42fa0a7e6cc58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-wubi-pinyin \
locale-fcitx-table-zh-CN;"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
