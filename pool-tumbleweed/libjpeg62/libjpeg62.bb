SUMMARY = "A SIMD-accelerated JPEG compression/decompression library"
DESCRIPTION = "A library for manipulating JPEG images. It supports \
architecture-specific SIMD instructions, such as SSE/SSE2/AVX2, \
AltiVec, NEON, MIPS DSPR2, and Loongson MMI."
LICENSE = "BSD-3-Clause"

PV = "62.3.0"

RPM_NAME = "libjpeg62-62.3.0-76.1.aarch64.rpm"
RPM_HASH = "464e41f22500f5ee0998bf4a99e0570c5b5fcda4c8d8021936372c0b130600292eea374058038661105a845a684cc9f1a30edac625d543737f0efce4e67bf878"

RPROVIDES:${PN} += "libjpeg.so.62 \
libjpeg62"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
