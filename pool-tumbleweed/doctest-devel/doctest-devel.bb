SUMMARY = "Single-header testing framework"
DESCRIPTION = "C++98/C++11 single-header testing framework for unit tests and TDD."
LICENSE = "MIT"

PV = "2.4.11"

RPM_NAME = "doctest-devel-2.4.11-1.3.aarch64.rpm"
RPM_HASH = "b38ee5fbfe2863e2782bd9bd2c7df44c946b1d1c28a63710757fe3db8c82a647d98759086fc1b5a88e348c31b7c914d5868016e751e1552a90549a10e7bc3f72"

RPROVIDES:${PN} += "cmake-doctest \
doctest-devel \
pkgconfig-doctest"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
