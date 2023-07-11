SUMMARY = "A modern, C++-native, header-only, test framework for unit-tests, TDD and BDD"
DESCRIPTION = "Catch2 stands for C++ Automated Test Cases in a Header and is a multi-paradigm \
test framework for C++. which also supports Objective-C (and maybe C). \
It is primarily distributed as a single header file, although certain \
extensions may require additional headers. \
 \
This package provides version 2.x of Catch2."
LICENSE = "BSL-1.0"

PV = "2.13.10"

RPM_NAME = "Catch2-2-devel-2.13.10-1.3.aarch64.rpm"
RPM_HASH = "e1cf6f600d077c26a33fafdb88a71ffc4c76e1056df4752df36f87e141d4e7a2efe04066fe9c48b15f69654c50231380196c65fc82fa836dcb7eabff5fcad428"

RPROVIDES:${PN} += "Catch2-2-devel \
Catch2-devel \
cmake-Catch2 \
pkgconfig-catch2"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
