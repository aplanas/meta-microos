SUMMARY = "Zlib replacement with SIMD optimizations"
DESCRIPTION = "zlib-ng is a zlib replacement with support for CPU intrinsics (SSSE3, \
AVX2, NEON, VSX) when available."
LICENSE = "Zlib"

PV = "2.1.3"

RPM_NAME = "libz-ng-compat1-2.1.3-1.1.aarch64.rpm"
RPM_HASH = "76dc2c678046222f980e3de451f3394f1b00090b3d8631c2f129646e6b6ddd4a6b288c6cec401cbb8bb4b1895c1f5004ba642da29e904f272935329817c712ea"

RPROVIDES:${PN} += "libz-ng-compat1 \
libz.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
