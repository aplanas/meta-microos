SUMMARY = "Development files for libmsiecf"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmsiecf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libmsiecf-devel-20221024-4.1.aarch64.rpm"
RPM_HASH = "8a6895ffcd6ea98457cb90a93cc2c3998663984678fe7f3433e29d75a004d32fa7aeddfa0aa8bf4d36bd86c740d3ddcb68954c20f87106d8cc7644d22a8a0a4c"

RPROVIDES:${PN} += "libmsiecf-devel \
pkgconfig-libmsiecf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libmsiecf1"

inherit rpm
