SUMMARY = "Zlib replacement with SIMD optimizations"
DESCRIPTION = "zlib-ng is a zlib replacement with support for CPU intrinsics (SSSE3, \
AVX2, NEON, VSX) when available."
LICENSE = "Zlib"

PV = "2.0.7"

RPM_NAME = "libz-ng-compat1-2.0.7-1.1.aarch64.rpm"
RPM_HASH = "b3d1218a59ba1ee078cda9a0ceccc1c76b8eb30049880399d5a867b9eaf4961f7d09f7c2d05f8f4492bdfa977263208563dde6c7aa7df81f8a42c1ffa1cfe3cf"

RPROVIDES:${PN} += "libz-ng-compat1 \
libz-ng-compat1(aarch-64) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libz.so.1(ZLIB_1.2.0.2)(64bit) \
libz.so.1(ZLIB_1.2.0.8)(64bit) \
libz.so.1(ZLIB_1.2.12)(64bit) \
libz.so.1(ZLIB_1.2.2)(64bit) \
libz.so.1(ZLIB_1.2.2.3)(64bit) \
libz.so.1(ZLIB_1.2.2.4)(64bit) \
libz.so.1(ZLIB_1.2.3.3)(64bit) \
libz.so.1(ZLIB_1.2.3.4)(64bit) \
libz.so.1(ZLIB_1.2.3.5)(64bit) \
libz.so.1(ZLIB_1.2.5.1)(64bit) \
libz.so.1(ZLIB_1.2.5.2)(64bit) \
libz.so.1(ZLIB_1.2.7.1)(64bit) \
libz.so.1(ZLIB_1.2.9)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
