SUMMARY = "Vietnamese Quoted Readable table for Fcitx"
DESCRIPTION = "Fcitx Vietnamese Quoted Readable table."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-vi-qr-0.2.4-2.5.noarch.rpm"
RPM_HASH = "bbd8c2b1f47ad83a120eef32a618a0354d018c67d489ed485975acc15d62b58f60497e2c4ce01d119cdd6cc7c5d5f92404fdf7565e4b5ff4974c0e2a49082788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-other fcitx-table-vi-qr"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
