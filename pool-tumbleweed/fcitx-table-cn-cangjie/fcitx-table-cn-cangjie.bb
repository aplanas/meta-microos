SUMMARY = "Simplified Chinese Tsang-Jei(Cangjie) table for fcitx"
DESCRIPTION = "Fcitx Tsang Jei (Cang Jie) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-cangjie-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "5046629fd17348521405d29f2e89915080a2323251720623d00601b3dc0de07a809ec2c7c0ef623a679bbf75ae73be44727182c5452d5e373ea88f9fe623c296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-cangjie"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
