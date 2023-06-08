SUMMARY = "Nature(Ziran) table for fcitx"
DESCRIPTION = "Fcitx Nature (Zi Ran Ma) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-ziran-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "f9acd40940e0389790e59170d54a2e2d51f65e12d7fdabea87e067207af602432bfafd754a912f84f36b41fe9acc4d94f2d775a9a454f00708d88fc32f5afae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-ziran"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
