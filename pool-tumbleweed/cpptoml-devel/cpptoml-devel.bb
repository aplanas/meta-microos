SUMMARY = "Header-only c++ library for parsing TOML"
DESCRIPTION = "cpptoml is a header-only c++ library for parsing TOML configuration files. \
 \
This package contains development headers for the cpptoml library"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "cpptoml-devel-0.1.1-3.8.aarch64.rpm"
RPM_HASH = "f3563598cf8abea1acdc9c890a2acf1a1326baa18553dbd7f9a4726b5f37e52a793ed9b3577388f386c5e8f0417c9f93cd3d214dbcb77353df76667fc5662f9a"

RPROVIDES:${PN} += "cmake-cpptoml \
cpptoml-devel"

RDEPENDS:${PN} += ""

inherit rpm
