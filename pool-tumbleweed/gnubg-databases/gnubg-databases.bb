SUMMARY = "Bearoff databases for gnubg"
DESCRIPTION = "Precalculated GNU Backgammon bearoff databases - its intelligence. If you prefer \
a stronger or weaker opponent calculate you own with tweaked parameters \
according to the documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.06.002"

RPM_NAME = "gnubg-databases-1.06.002-3.5.noarch.rpm"
RPM_HASH = "40a21928b25fe79b71ea36ea0b156eed14c3aa28ad3a7471ff0332bf9ed9471838a36460a0bf7ab49d2260addb45b9279c350c396e01143513454d69f65cf264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-databases"

RDEPENDS:${PN} += "gnubg"

inherit rpm
