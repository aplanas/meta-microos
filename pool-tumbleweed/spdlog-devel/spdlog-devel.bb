SUMMARY = "Header files for spdlog"
DESCRIPTION = "The spdlog-devel package contains C++ header files for developing \
applications that use spdlog."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "spdlog-devel-1.11.0-2.1.aarch64.rpm"
RPM_HASH = "a426eb72569ab890b498ffadacea4b7531ce00e5ee5e568f1cd457425d8d96e0b9ebc51206dd2421af623fd8f2e6a441c216a4f8f16d2282bb90c7e32b722b0b"

RPROVIDES:${PN} += "cmake(spdlog) \
pkgconfig(spdlog) \
spdlog-devel \
spdlog-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspdlog1_11 \
libstdc++-devel \
pkgconfig(fmt)"

inherit rpm
