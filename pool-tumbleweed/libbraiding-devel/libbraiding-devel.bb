SUMMARY = "Development files for the CBraid library"
DESCRIPTION = "CBraid is a C++ library for various computations on braid groups, \
such as normal forms. \
 \
This subpackage provides the development headers for it."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "libbraiding-devel-1.2-1.3.aarch64.rpm"
RPM_HASH = "d46e98d5584d5146aab3e67e8f7006a61f0b477d072aa7621e12b9f507add4e43df983ccbc5588b57f598f37a390bceb877865993a69984fdd53be4844ea9d57"

RPROVIDES:${PN} += "libbraiding-devel"

RDEPENDS:${PN} += "libbraiding0"

inherit rpm
