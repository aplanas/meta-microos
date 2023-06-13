SUMMARY = "Vector Graphics Library with Cross-Device Output Support"
DESCRIPTION = "Cairo is a vector graphics library with cross-device output support. \
Currently supported output targets include the X Window System, \
in-memory image buffers, and PostScript. Cairo is designed to produce \
identical output on all output media while taking advantage of display \
hardware acceleration when available."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.17.8"

RPM_NAME = "libcairo-script-interpreter2-1.17.8-1.1.aarch64.rpm"
RPM_HASH = "ec2a72b493769cf9517e8ee553d1521e4bfb09b9b85a17ae3e615d9f19db34e29f5b9c9c6af2616d768090a701ed58bb275054bc9ca2b9b0fce01f6181969643"

RPROVIDES:${PN} += "libcairo-script-interpreter.so.2()(64bit) \
libcairo-script-interpreter2 \
libcairo-script-interpreter2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libz.so.1()(64bit)"

inherit rpm
