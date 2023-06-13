SUMMARY = "Efficient and performance-portable SIMD"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "libhwy1-1.0.4-4.1.aarch64.rpm"
RPM_HASH = "d44061422412e29802f9e5369d781b48728d937fac629d868a3d1f140675e396832ed811ba8fb835c9d2f6b4071cf85208585fd11aaa9b86001d58815486a448"

RPROVIDES:${PN} += "libhwy.so.1()(64bit) \
libhwy.so.1(HWY_0)(64bit) \
libhwy1 \
libhwy1(aarch-64) \
libhwy_contrib.so.1()(64bit) \
libhwy_contrib.so.1(HWY_0)(64bit) \
libhwy_test.so.1()(64bit) \
libhwy_test.so.1(HWY_0)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.25)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit)"

inherit rpm
