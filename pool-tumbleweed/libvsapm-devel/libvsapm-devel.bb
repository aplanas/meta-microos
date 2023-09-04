SUMMARY = "Development files for libvsapm"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsapm."
LICENSE = "LGPL-3.0-or-later"

PV = "20230506"

RPM_NAME = "libvsapm-devel-20230506-1.1.aarch64.rpm"
RPM_HASH = "dbc0d06cd9274654338c3fafd12b5457ed216b613fce331db2c5ccff34c809bd8db73874449638693864ef6f0f2a026607ae41f3c50197f229573b4a2e05902a"

RPROVIDES:${PN} += "libvsapm-devel \
pkgconfig-libvsapm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvsapm1"

inherit rpm
