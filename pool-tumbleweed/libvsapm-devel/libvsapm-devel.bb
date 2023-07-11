SUMMARY = "Development files for libvsapm"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsapm."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "libvsapm-devel-20210626-4.9.aarch64.rpm"
RPM_HASH = "b7c464b7fc6bc220d90b208c8d21f84d387f0c58b40d9a43e0accb941a2b10072712c287f2a63f52f726f80fe5e7bd15ab262e07283dbe08181b649a58738444"

RPROVIDES:${PN} += "libvsapm-devel \
pkgconfig-libvsapm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvsapm1"

inherit rpm
