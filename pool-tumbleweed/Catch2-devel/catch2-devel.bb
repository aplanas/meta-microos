SUMMARY = "A modern, C++-native, header-only, test framework for unit-tests, TDD and BDD"
DESCRIPTION = "Catch2 stands for C++ Automated Test Cases in a Header and is a multi-paradigm \
test framework for modern C++14 and newer. \
It also provides basic micro-benchmarking features, and simple BDD macros."
LICENSE = "BSL-1.0"

PV = "3.3.2"

RPM_NAME = "Catch2-devel-3.3.2-1.4.aarch64.rpm"
RPM_HASH = "aed5aedf4c47efe79829bf54e0bac01d91567f71ce0d249b6f40e6f300e4c316186c85428efdffe3aba0d847688fddb9c97f0a17cdeae1e89b1c2686b9fc8cca"

RPROVIDES:${PN} += "Catch2-devel \
cmake-Catch2 \
pkgconfig-catch2 \
pkgconfig-catch2-with-main"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
