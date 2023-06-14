SUMMARY = "A modern, C++-native, header-only, test framework for unit-tests, TDD and BDD"
DESCRIPTION = "Catch2 stands for C++ Automated Test Cases in a Header and is a multi-paradigm \
test framework for C++. which also supports Objective-C (and maybe C). \
It is primarily distributed as a single header file, although certain \
extensions may require additional headers. \
 \
This package provides version 2.x of Catch2."
LICENSE = "BSL-1.0"

PV = "2.13.10"

RPM_NAME = "Catch2-2-devel-2.13.10-1.2.aarch64.rpm"
RPM_HASH = "6025d3c67334d09b436161e910a07dc4d88de34461779f3f04972af36db4e84eef596bfd46829b7a4dce684c9cb00ed2e3c8111f625ff007e9d564ba3bd3dc05"

RPROVIDES:${PN} += "Catch2-2-devel \
Catch2-devel \
cmake-Catch2 \
pkgconfig-catch2"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
