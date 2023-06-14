SUMMARY = "Development files for Highway"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics. \
 \
Development files for Highway."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "highway-devel-1.0.4-4.1.aarch64.rpm"
RPM_HASH = "1a6e0a4ed2f8cd2551b3c803034b15d9256634a19e4001e257131f03f2eb7c216d26f2f047e8049cec7dedb739c4137f8bcfed6730f26b5e297a087306823ce0"

RPROVIDES:${PN} += "cmake-hwy \
highway-devel \
pkgconfig-libhwy \
pkgconfig-libhwy-contrib \
pkgconfig-libhwy-test"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhwy1 \
pkgconfig-gtest"

inherit rpm
