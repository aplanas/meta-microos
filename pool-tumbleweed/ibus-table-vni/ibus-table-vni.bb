SUMMARY = "Vni table for ibus-table"
DESCRIPTION = "ibus-table-mongol-bichig provides the Vietnamese Vni table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-vni-1.3.16-1.1.noarch.rpm"
RPM_HASH = "727f164080962f967e1ba5f8303476f396d0df113f2640bbc1bd5f91823f4c24e0317dd90e3843d55b47eccf32801c2fa1f02c7f93741d51959173ff6a185e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-vni"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
