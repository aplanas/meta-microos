SUMMARY = "Wubi and pinyin(wubi-pinyin) table for fcitx"
DESCRIPTION = "Fcitx Wubi (Wu Bi Zi Xing) and Pinyin mixed input tables for Simplified Chinese. \
 \
Wubi in Fcitx is based on wubi x86."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-wubi-pinyin-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "7981b71f653cdb686a6ca6af377b36002c50c55d038332a9c03ed87dd9aef691247aaf1773c1b192b546571975d70a3866b3584697ff1cbd98e8d6b070b7572a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-wubi-pinyin \
locale(fcitx-table:zh_CN;)"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
