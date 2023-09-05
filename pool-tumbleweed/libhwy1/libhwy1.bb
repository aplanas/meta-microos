SUMMARY = "Efficient and performance-portable SIMD"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "libhwy1-1.0.5-1.1.aarch64.rpm"
RPM_HASH = "99d50d1aa659836d851ac2fbb60171227e00989a92900329900a8e44b27cd3471294652b69835fd21bf9f5ee48e0d39b3d80b048bbc93c8e4de4698751cf674f"

RPROVIDES:${PN} += "libhwy-contrib.so.1 \
libhwy-test.so.1 \
libhwy.so.1 \
libhwy1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
