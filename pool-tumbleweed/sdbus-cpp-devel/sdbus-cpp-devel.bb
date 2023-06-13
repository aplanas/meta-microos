SUMMARY = "Development files for sdbus-cpp"
DESCRIPTION = "CMake, pkg-config, headers and other development files for sdbus-cpp."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "sdbus-cpp-devel-1.2.0-1.5.aarch64.rpm"
RPM_HASH = "9107cfb6842350476b98ccb655fa2fe4b212bfbfac999bd8774d85aa36e1a52b526a6e02eab2d11313f74d4873fcd1ee71020eb639b99943d7f84e016c9c5dba"

RPROVIDES:${PN} += "cmake(sdbus-c++) \
cmake(sdbus-c++-tools) \
pkgconfig(sdbus-c++) \
pkgconfig(sdbus-c++-tools) \
sdbus-cpp-devel \
sdbus-cpp-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsdbus-c++1 \
pkgconfig(libsystemd)"

inherit rpm
