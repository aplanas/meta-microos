SUMMARY = "Development headers for Boost.Stacktrace library"
DESCRIPTION = "This package contains development headers for Boost.Stacktrace library. \
Boost.Stacktrace is a simple C++03 library that provide information \
about call sequence in a human-readable form. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_stacktrace-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "c7316c1972510588ebb4692f79a72e6abf2bf1a794cb55b21a9a6a0065536c2da190d7c0f2eb6b385e0be98439e27b0013317cf1f8b74ecc21a01c495000f566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_stacktrace-devel"
RDEPENDS:${PN} += "libboost_stacktrace1_82_0-devel"

inherit rpm
