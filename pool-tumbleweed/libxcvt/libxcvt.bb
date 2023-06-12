SUMMARY = "CVT standard timing modeline generator"
DESCRIPTION = "libxcvt is a library providing a standalone version of the X server \
implementation of the VESA Coordinated Video Timings (CVT) standard \
timing modelines generator. libxcvt also provides a standalone \
version of the command line tool cvt copied from the Xorg \
implementation and is meant to be a direct replacement to the version \
provided by the Xorg server."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "libxcvt-0.1.2-1.3.aarch64.rpm"
RPM_HASH = "34d1327cc81f28fdfb87a36321e333585d8e857df9d5ed08ee42faab3f7e61dd380f89d360cd3e2a54c47f63798840e63f3bad8f3a86dbf5a3e560c2f7e8d3a8"

RPROVIDES:${PN} += "libxcvt \
libxcvt(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libxcvt.so.0()(64bit)"

inherit rpm
