SUMMARY = "Mongol Bichig table for ibus-table"
DESCRIPTION = "ibus-table-mongol-bichig provides the Mongol Bichig table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-mongol-bichig-1.3.16-1.1.noarch.rpm"
RPM_HASH = "2b80b8d4dbab2a551572891eaa69b2f791de9311c9644ae6421ee669990b6e4fe6faff864143752ee449d6d3a70c82ba7f7c899c634e3c9173c37f97f799862e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-mongol-bichig"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
