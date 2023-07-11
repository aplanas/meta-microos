SUMMARY = "A SIMD-accelerated JPEG compression/decompression library"
DESCRIPTION = "A library for manipulating JPEG images. It supports \
architecture-specific SIMD instructions, such as SSE/SSE2/AVX2, \
AltiVec, NEON, MIPS DSPR2, and Loongson MMI."
LICENSE = "BSD-3-Clause"

PV = "8.2.2"

RPM_NAME = "libturbojpeg0-8.2.2-76.1.aarch64.rpm"
RPM_HASH = "b7ce4364721a4551411eb311566c1d693683c9d877bc810a63e9eb0a0ae643e7c53de2b53b3422c9550731eec7353d774aa8df8025fcaa2da11dd1ac738c3aaa"

RPROVIDES:${PN} += "libturbojpeg.so.0 \
libturbojpeg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
