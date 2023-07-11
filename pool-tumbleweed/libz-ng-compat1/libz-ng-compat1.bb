SUMMARY = "Zlib replacement with SIMD optimizations"
DESCRIPTION = "zlib-ng is a zlib replacement with support for CPU intrinsics (SSSE3, \
AVX2, NEON, VSX) when available."
LICENSE = "Zlib"

PV = "2.1.2"

RPM_NAME = "libz-ng-compat1-2.1.2-2.1.aarch64.rpm"
RPM_HASH = "b464d27d77dea5430ccff35963d22804939397a0b71ce2e31169f965f8ea32227cda919b29e24a178c961a44dc9cdcfdcf5da02625a439d17e3f6c81ec414cce"

RPROVIDES:${PN} += "libz-ng-compat1 \
libz.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
