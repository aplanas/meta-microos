SUMMARY = "Development files for sdbus-cpp"
DESCRIPTION = "CMake, pkg-config, headers and other development files for sdbus-cpp."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "sdbus-cpp-devel-1.2.0-1.6.aarch64.rpm"
RPM_HASH = "af23fe020ba6179f9d853049cc9314d75894bf94ebbc16676f32eb35dabfb43d7c3048363daffaf3392fcf3a74503213732c627235353bf2c67580c82cb946c7"

RPROVIDES:${PN} += "cmake-sdbus-c++ \
cmake-sdbus-c++-tools \
pkgconfig-sdbus-c++ \
pkgconfig-sdbus-c++-tools \
sdbus-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsdbus-c++1 \
pkgconfig-libsystemd"

inherit rpm
