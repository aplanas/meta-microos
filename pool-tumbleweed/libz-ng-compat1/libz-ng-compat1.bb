SUMMARY = "Zlib replacement with SIMD optimizations"
DESCRIPTION = "zlib-ng is a zlib replacement with support for CPU intrinsics (SSSE3, \
AVX2, NEON, VSX) when available."
LICENSE = "Zlib"

PV = "2.0.7"

RPM_NAME = "libz-ng-compat1-2.0.7-1.1.aarch64.rpm"
RPM_HASH = "b3d1218a59ba1ee078cda9a0ceccc1c76b8eb30049880399d5a867b9eaf4961f7d09f7c2d05f8f4492bdfa977263208563dde6c7aa7df81f8a42c1ffa1cfe3cf"

RPROVIDES:${PN} += "libz-ng-compat1 \
libz-ng-compat1(aarch-64) \
libz.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
