SUMMARY = "Development files for libwrc, a Windows Resouce Compiler format support library"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libwrc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc-devel-20230318-1.2.aarch64.rpm"
RPM_HASH = "260c91216f98487f4f0af180a8ec37b0c7eacf59526b2bafc4e82ddd012971d762abd4ecb340497246f7e4d3c833f6704591af5d7a0172eae583e5ffb498f47b"

RPROVIDES:${PN} += "libwrc-devel \
libwrc-devel(aarch-64) \
pkgconfig(libwrc)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libwrc1"

inherit rpm
