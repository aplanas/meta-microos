SUMMARY = "A SIMD-accelerated JPEG compression/decompression library"
DESCRIPTION = "A library for manipulating JPEG images. It supports \
architecture-specific SIMD instructions, such as SSE/SSE2/AVX2, \
AltiVec, NEON, MIPS DSPR2, and Loongson MMI."
LICENSE = "BSD-3-Clause"

PV = "62.3.0"

RPM_NAME = "libjpeg62-62.3.0-75.1.aarch64.rpm"
RPM_HASH = "ab190c5d10d8718d78bf5b883489a58b6a5cb3f77ede7480c71ddbe84627be6806adf6bbc0abe020d849b01d84b42cf1d95e8ab2d3486dc69f78129568ba2011"

RPROVIDES:${PN} += "libjpeg.so.62 \
libjpeg62"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
