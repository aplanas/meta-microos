SUMMARY = "Bearoff databases for gnubg"
DESCRIPTION = "Precalculated GNU Backgammon bearoff databases - its intelligence. If you prefer \
a stronger or weaker opponent calculate you own with tweaked parameters \
according to the documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.06.002"

RPM_NAME = "gnubg-databases-1.06.002-3.4.noarch.rpm"
RPM_HASH = "8fbdac3ec448216dbb1774b2d3b47681ee6819664126a2eb99c4ea65a53f049359cc2f3986017a18c3e0ef017b48b83b2fafa5c0de3596f3ccfe720cbec72063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-databases"

RDEPENDS:${PN} += "gnubg"

inherit rpm
