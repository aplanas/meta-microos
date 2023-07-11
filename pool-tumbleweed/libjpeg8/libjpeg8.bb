SUMMARY = "A SIMD-accelerated JPEG compression/decompression library"
DESCRIPTION = "A library for manipulating JPEG images. It supports \
architecture-specific SIMD instructions, such as SSE/SSE2/AVX2, \
AltiVec, NEON, MIPS DSPR2, and Loongson MMI."
LICENSE = "BSD-3-Clause"

PV = "8.2.2"

RPM_NAME = "libjpeg8-8.2.2-76.1.aarch64.rpm"
RPM_HASH = "b63678ff3051a7c82fd0834c153469d84ed29f84726c54b33ff381939ef2614b17765c0a887dec2ace6f3e0e70a8a16febdd9f44d64ca83ea45e3615fafc0537"

RPROVIDES:${PN} += "libjpeg.so.8 \
libjpeg8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
