SUMMARY = "Development files for unittest-cpp"
DESCRIPTION = "A lightweight unit testing framework for C++. \
 \
This package contains header files and libraries needed to develop \
application that use unittest-cpp."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "unittest-cpp-devel-2.0.0-2.3.aarch64.rpm"
RPM_HASH = "a4ca60452b39cf3276c68f6e3f57e61d71f8a0bac123be5458511ead4a1c7ba1b81c6eb3b45dc32c06c9ec5ca58389bf3b343ed1730956e592d8811777212e2a"

RPROVIDES:${PN} += "cmake-UnitTest++ \
pkgconfig-UnitTest++ \
unittest-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libUnitTest++-2-0-0"

inherit rpm
