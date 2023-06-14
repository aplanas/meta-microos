SUMMARY = "Zlib replacement with SIMD optimizations"
DESCRIPTION = "zlib-ng is a zlib replacement with support for CPU intrinsics (SSSE3, \
AVX2, NEON, VSX) when available."
LICENSE = "Zlib"

PV = "2.0.7"

RPM_NAME = "libz-ng2-2.0.7-1.1.aarch64.rpm"
RPM_HASH = "2dbd1120ed96a8c1f583fcfdc32f945204b9d5785950b46dcef2bfa87e45f1351a62f83a6dcb6704d63d0526e8b51983e88492bbda057f52cc829e970dfe4235"

RPROVIDES:${PN} += "libz-ng.so.2 \
libz-ng2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
