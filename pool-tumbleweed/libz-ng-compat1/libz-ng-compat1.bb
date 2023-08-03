SUMMARY = "Zlib replacement with SIMD optimizations"
DESCRIPTION = "zlib-ng is a zlib replacement with support for CPU intrinsics (SSSE3, \
AVX2, NEON, VSX) when available."
LICENSE = "Zlib"

PV = "2.1.3"

RPM_NAME = "libz-ng-compat1-2.1.3-2.1.aarch64.rpm"
RPM_HASH = "cb3b5c9d6cb0f70ceeceff479a4be035726159060bea880d125bfd66e7feab3517451d2624b70835f003a0f675af4c2807bc166559a71ead0153eff98c92de52"

RPROVIDES:${PN} += "libz-ng-compat1 \
libz.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
