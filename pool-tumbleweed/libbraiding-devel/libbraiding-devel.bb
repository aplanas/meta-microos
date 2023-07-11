SUMMARY = "Development files for the CBraid library"
DESCRIPTION = "CBraid is a C++ library for various computations on braid groups, \
such as normal forms. \
 \
This subpackage provides the development headers for it."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "libbraiding-devel-1.2-1.4.aarch64.rpm"
RPM_HASH = "de3a3290e3f20560e61ccc53a12ae9a9e8482dbc3b28fd4da9a32518e481b02856fd3b01894639d1a52e8a51ccf64498c99792cf0bdf43eadafa60d807dead54"

RPROVIDES:${PN} += "libbraiding-devel"

RDEPENDS:${PN} += "libbraiding0"

inherit rpm
