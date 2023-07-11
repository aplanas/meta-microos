SUMMARY = "Common data for xviewer-plugins"
DESCRIPTION = "Common data required by all xviewer plugins"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugins-data-1.4.1-1.7.noarch.rpm"
RPM_HASH = "6b6878673ce7334388a4bf4833b03ed2acc6ba845ffbcebdf0dbc17aed4ef7da166fec501d659f06053391822954307a08f093069eca2ba0fc9d0b57f273c682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xviewer-plugins-data"

RDEPENDS:${PN} += "xviewer"

inherit rpm
