SUMMARY = "A library implementing the EBU R128 loudness standard"
DESCRIPTION = "This library implements the EBU R 128 standard for loudness normalisation. \
 \
This package contains the shared library."
LICENSE = "MIT"

PV = "1.2.6"

RPM_NAME = "libebur128-1-1.2.6-1.8.aarch64.rpm"
RPM_HASH = "9117f4c98f0b0f8c4d73eb7d898cefbefe9411acde29e02ed6acbcd9e18be9d2a017881821cbb43a43ccbdc10f86a3c4bf08c3790de82cc549f376bc2efd5033"

RPROVIDES:${PN} += "libebur128-1 \
libebur128-1(aarch-64) \
libebur128.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
