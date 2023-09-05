SUMMARY = "Development files for Highway"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics. \
 \
Development files for Highway."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "highway-devel-1.0.5-1.1.aarch64.rpm"
RPM_HASH = "ebede6ba7b3627fecc65e50bbdedc7c664147b86bc7b9d05de4a37f855859a32811240edf6476991650fdae2a52e8c87505469fa27af269db4c34fd8d32341f8"

RPROVIDES:${PN} += "cmake-hwy \
highway-devel \
pkgconfig-libhwy \
pkgconfig-libhwy-contrib \
pkgconfig-libhwy-test"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhwy1 \
pkgconfig-gtest"

inherit rpm
