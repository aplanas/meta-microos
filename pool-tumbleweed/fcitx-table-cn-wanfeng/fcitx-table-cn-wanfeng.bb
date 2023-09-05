SUMMARY = "Evening Breeze(Wanfeng) table for fcitx"
DESCRIPTION = "Fcitx Evening Breeze (Wan feng) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-wanfeng-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "635debf8f7da76c94f6213e89c57d66f2d037137fe6a8d06771ee82166b7fa5dd1349f3ee347e50c601c48aa66ef93831c1ce44dcf77c55b99b5522558ca1941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-wanfeng"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
