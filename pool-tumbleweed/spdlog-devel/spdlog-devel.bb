SUMMARY = "Header files for spdlog"
DESCRIPTION = "The spdlog-devel package contains C++ header files for developing \
applications that use spdlog."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "spdlog-devel-1.12.0-1.1.aarch64.rpm"
RPM_HASH = "d679fa83a52cb160dd984e55b40a24b0abcc08e1343409aecc783371203037aeb11c890303ba6409e0fde9c0b1d9ad5401c196861942e40b22551e6353a25392"

RPROVIDES:${PN} += "cmake-spdlog \
pkgconfig-spdlog \
spdlog-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspdlog1-12 \
libstdc++-devel \
pkgconfig-fmt"

inherit rpm
