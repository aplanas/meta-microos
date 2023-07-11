SUMMARY = "Nature(Ziran) table for fcitx"
DESCRIPTION = "Fcitx Nature (Zi Ran Ma) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-ziran-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "42ffafe36a20d1fc5f55dc1f4a7cce68a7ca59c69c5a13a0dc763273bcdd41630bcda7d953c4274222f0430f5d3be9c6ee3b6f5627fc975825cd60b8aaad4b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-ziran"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
