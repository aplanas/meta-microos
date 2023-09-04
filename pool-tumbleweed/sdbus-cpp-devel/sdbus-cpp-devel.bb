SUMMARY = "Development files for sdbus-cpp"
DESCRIPTION = "CMake, pkg-config, headers and other development files for sdbus-cpp."
LICENSE = "LGPL-2.1-only"

PV = "1.3.0"

RPM_NAME = "sdbus-cpp-devel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "057531ecd0905c2108f753710146b17a80faabfaa60dc5a8c3894c46aeb6b02a8b9ce577e5719d87561e8ebdaf1b332706080cf16b676e07f623d29d59667021"

RPROVIDES:${PN} += "cmake-sdbus-c++ \
cmake-sdbus-c++-tools \
pkgconfig-sdbus-c++ \
pkgconfig-sdbus-c++-tools \
sdbus-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsdbus-c++1 \
pkgconfig-libsystemd"

inherit rpm
