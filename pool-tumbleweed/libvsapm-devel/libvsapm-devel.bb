SUMMARY = "Development files for libvsapm"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsapm."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "libvsapm-devel-20210626-4.7.aarch64.rpm"
RPM_HASH = "20e258a57f88f1e7a9375568934fa653ca7c4480a8b614ca7fd6ca844b86c33b42d6bb53264d8fae15c7c89d62811febab7a6c1eebaf7d6a7f098d42a2a3059c"

RPROVIDES:${PN} += "libvsapm-devel \
pkgconfig-libvsapm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvsapm1"

inherit rpm
