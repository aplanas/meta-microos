SUMMARY = "A SIMD-accelerated JPEG compression/decompression library"
DESCRIPTION = "A library for manipulating JPEG images. It supports \
architecture-specific SIMD instructions, such as SSE/SSE2/AVX2, \
AltiVec, NEON, MIPS DSPR2, and Loongson MMI."
LICENSE = "BSD-3-Clause"

PV = "8.2.2"

RPM_NAME = "libturbojpeg0-8.2.2-75.1.aarch64.rpm"
RPM_HASH = "61b1365f7f95c9317964ca18fd9074116d4b71f271c743451d06a3cac245c6ea29767eb7cec0832cddef35e2a35873b7122dbc6198f6f9fde01bfd4fcc33e08a"

RPROVIDES:${PN} += "libturbojpeg.so.0()(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.0)(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.1)(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.2)(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.4)(64bit) \
libturbojpeg.so.0(TURBOJPEG_2.0)(64bit) \
libturbojpeg0 \
libturbojpeg0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
