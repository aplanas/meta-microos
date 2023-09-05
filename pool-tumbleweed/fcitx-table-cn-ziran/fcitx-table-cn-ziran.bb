SUMMARY = "Nature(Ziran) table for fcitx"
DESCRIPTION = "Fcitx Nature (Zi Ran Ma) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-ziran-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "af3c32ab64ba1c26716be5f291520d47a7cd3b16cfc82ee4be4a28b97000bdd79de30c703b852e55ad0014e2d445f86e2ec8fb6ab33be9b8b192432999cb7bd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-ziran"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
