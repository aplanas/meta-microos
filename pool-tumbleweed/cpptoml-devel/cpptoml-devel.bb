SUMMARY = "Header-only c++ library for parsing TOML"
DESCRIPTION = "cpptoml is a header-only c++ library for parsing TOML configuration files. \
 \
This package contains development headers for the cpptoml library"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "cpptoml-devel-0.1.1-3.7.aarch64.rpm"
RPM_HASH = "1b9e26cf6452d0b6fec8b74b75d7762e57b6735bc614884f65568fc47cbda753de29d2da7913f049b5da74c9692e86c8cc6eb216954ec330230421eacb3a4168"

RPROVIDES:${PN} += "cmake-cpptoml \
cpptoml-devel"

RDEPENDS:${PN} += ""

inherit rpm
