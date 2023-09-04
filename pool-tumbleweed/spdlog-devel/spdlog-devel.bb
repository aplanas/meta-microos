SUMMARY = "Header files for spdlog"
DESCRIPTION = "The spdlog-devel package contains C++ header files for developing \
applications that use spdlog."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "spdlog-devel-1.12.0-2.1.aarch64.rpm"
RPM_HASH = "c83010ac9e3174b4e6d0d769dfb40154be73465304edfdae85a6c1474e77b5548f9102474f2940e1beb6d851d35969e8bbb8422775da7f9b977c4109e8733bea"

RPROVIDES:${PN} += "cmake-spdlog \
pkgconfig-spdlog \
spdlog-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspdlog1-12 \
libstdc++-devel \
pkgconfig-fmt"

inherit rpm
