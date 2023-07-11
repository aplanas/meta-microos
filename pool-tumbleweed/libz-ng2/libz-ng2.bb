SUMMARY = "Zlib replacement with SIMD optimizations"
DESCRIPTION = "zlib-ng is a zlib replacement with support for CPU intrinsics (SSSE3, \
AVX2, NEON, VSX) when available."
LICENSE = "Zlib"

PV = "2.1.2"

RPM_NAME = "libz-ng2-2.1.2-2.1.aarch64.rpm"
RPM_HASH = "3c052c9956528ab7bea5fc3b31b0cd7eff55440fcc63207b0d9692616f099bba801fc03469504ab54b692b13831fc9be79b39f01002aece77ad8f788c83d7d1c"

RPROVIDES:${PN} += "libz-ng.so.2 \
libz-ng2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
