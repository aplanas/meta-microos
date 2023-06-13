SUMMARY = "A SIMD-accelerated JPEG compression/decompression library"
DESCRIPTION = "A library for manipulating JPEG images. It supports \
architecture-specific SIMD instructions, such as SSE/SSE2/AVX2, \
AltiVec, NEON, MIPS DSPR2, and Loongson MMI."
LICENSE = "BSD-3-Clause"

PV = "8.2.2"

RPM_NAME = "libjpeg8-8.2.2-75.1.aarch64.rpm"
RPM_HASH = "88cc0e8d6fb8b6fc219af4a7b400348e7b116e191459b404685d20f471aa9888f0580e4798d6e94a88e7a705e13d98157ab98953af8adc47edfd95a22677e174"

RPROVIDES:${PN} += "libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEGTURBO_8.0)(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libjpeg8 \
libjpeg8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
