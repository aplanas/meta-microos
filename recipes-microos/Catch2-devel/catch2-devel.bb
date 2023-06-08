SUMMARY = "A modern, C++-native, header-only, test framework for unit-tests, TDD and BDD"
DESCRIPTION = "Catch2 stands for C++ Automated Test Cases in a Header and is a multi-paradigm \
test framework for modern C++14 and newer. \
It also provides basic micro-benchmarking features, and simple BDD macros."
LICENSE = "BSL-1.0"

PV = "3.3.2"

RPM_NAME = "Catch2-devel-3.3.2-1.3.aarch64.rpm"
RPM_HASH = "b1d63f9b124e12e4bfb9829a2ed4ccd0d3f176476726d69ad1810e5c0ec8eda3a06f59f463ae9f073f78c41b76184097a4fcd73634671e90ce35dd59587a9d99"

RPROVIDES:${PN} += "Catch2-devel Catch2-devel(aarch-64) cmake(Catch2) pkgconfig(catch2) pkgconfig(catch2-with-main)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
