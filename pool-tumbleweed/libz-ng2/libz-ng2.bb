SUMMARY = "Zlib replacement with SIMD optimizations"
DESCRIPTION = "zlib-ng is a zlib replacement with support for CPU intrinsics (SSSE3, \
AVX2, NEON, VSX) when available."
LICENSE = "Zlib"

PV = "2.1.3"

RPM_NAME = "libz-ng2-2.1.3-2.1.aarch64.rpm"
RPM_HASH = "77a00e36936df90a9aed75b5cff80c3102070688e8b635089fee0aca320d37178712b973a67454151b222e82a6f5becbaa1a585f2be9db295957421a08852c9c"

RPROVIDES:${PN} += "libz-ng.so.2 \
libz-ng2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
