SUMMARY = "Metapackage, requires all core Packages"
DESCRIPTION = "Metapackage, Requires: all core Packages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-core-packages-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "f025b8236a5fa34d9ace16464ef6a47d13df6771819a53625098a405eca9b04d0ef37a6dd230398310fdf1212df0f3220b8733faea161bac1e81eeede982212c"

RPROVIDES:${PN} += "R-core-packages"

RDEPENDS:${PN} += "R-compiler \
R-datasets \
R-grDevices \
R-graphics \
R-grid \
R-methods \
R-parallel \
R-splines \
R-stats \
R-stats4 \
R-tcltk \
R-tools \
R-utils"

inherit rpm
