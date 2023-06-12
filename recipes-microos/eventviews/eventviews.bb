SUMMARY = "Eventviews Library"
DESCRIPTION = "This internal library implements a GUI framework for viewing various \
calendar events in agenda, list, month view or timeline fashion."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "eventviews-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "095a67f64f7bec780eb57ced3cdba747d02a123a646edb8fad16b876dc8207fb7e8797de17146db6d3b7f7db92d040b09058c3d60e2d73d5a20fab83dbed626c"

RPROVIDES:${PN} += "eventviews eventviews(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
