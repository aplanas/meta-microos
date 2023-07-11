SUMMARY = "Eventviews Library"
DESCRIPTION = "This internal library implements a GUI framework for viewing various \
calendar events in agenda, list, month view or timeline fashion."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "eventviews-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "60b16ecc4c1273a1b7b3bcf1785a2ef2180561644cb6c856a7e467beaabac6f0f78d3b533eb3d8aeee62e9c2758a77fbdfc06f734f19e7b693b914bba67ed6cd"

RPROVIDES:${PN} += "eventviews"

RDEPENDS:${PN} += ""

inherit rpm
