SUMMARY = "Two stroke(Erbi) table for fcitx"
DESCRIPTION = "Fcitx Two Stroke (Er Bi) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-erbi-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "cc3b205082647cd2538d380e130b767bb437e13bff8de1a483dc9338d0c2078fad61cde6e7bd4154fe039e410b375c9f7b6614bcc8424a2d0cfc37f04846fd6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-erbi"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
