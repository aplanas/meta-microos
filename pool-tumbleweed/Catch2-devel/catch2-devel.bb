SUMMARY = "A modern, C++-native, header-only, test framework for unit-tests, TDD and BDD"
DESCRIPTION = "Catch2 stands for C++ Automated Test Cases in a Header and is a multi-paradigm \
test framework for modern C++14 and newer. \
It also provides basic micro-benchmarking features, and simple BDD macros."
LICENSE = "BSL-1.0"

PV = "3.4.0"

RPM_NAME = "Catch2-devel-3.4.0-1.1.aarch64.rpm"
RPM_HASH = "29cecf44de7955a159dc6c9c743d23c07559a6a51ea0e7e0e6a8a8a6c858ce219ee4dc38691bb771aa666a78aac13f26688bf672a1945d0ea15c6a6a21b47a49"

RPROVIDES:${PN} += "Catch2-devel \
cmake-Catch2 \
pkgconfig-catch2 \
pkgconfig-catch2-with-main"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
