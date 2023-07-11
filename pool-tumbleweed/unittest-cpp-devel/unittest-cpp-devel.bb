SUMMARY = "Development files for unittest-cpp"
DESCRIPTION = "A lightweight unit testing framework for C++. \
 \
This package contains header files and libraries needed to develop \
application that use unittest-cpp."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "unittest-cpp-devel-2.0.0-2.4.aarch64.rpm"
RPM_HASH = "f3f49c7e78d512924d14d99a7f038309bcd95aab73201099c0edea2efd9298da7c126ab58bb0c8776cb942f49274e59314a50449fc8b644e78c867ff8f009d26"

RPROVIDES:${PN} += "cmake-UnitTest++ \
pkgconfig-UnitTest++ \
unittest-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libUnitTest++-2-0-0"

inherit rpm
