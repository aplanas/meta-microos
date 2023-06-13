SUMMARY = "Shared library for framel - a library for gravitational wave frame data"
DESCRIPTION = "The Frame Library is a software in C language, with interfaces to python and \
matlab, dedicated to frame data manipulation including file input/output. \
 \
This package provides the shared library for framel."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "libframel8-8.42.3-1.5.aarch64.rpm"
RPM_HASH = "efaa439ba8a2b8d5c58adf3767ca6410f847a798be50dede1073eb50ed6fa48b4d29da5c3b2081bd36fbb3a34ffebe419989d5d4e08c4629ae01ef018212d2fa"

RPROVIDES:${PN} += "libframel.so.8()(64bit) \
libframel8 \
libframel8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
