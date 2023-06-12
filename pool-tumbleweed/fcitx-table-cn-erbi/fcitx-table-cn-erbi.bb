SUMMARY = "Two stroke(Erbi) table for fcitx"
DESCRIPTION = "Fcitx Two Stroke (Er Bi) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-erbi-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "ea1e63b3495aaead7f7475b33b2145d8447778272148183c8d7079c9d7d54b2e3864f08b507d5a0264fb7825b89a7df37f0d17454990e766db6fefcade72d7a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-erbi"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
