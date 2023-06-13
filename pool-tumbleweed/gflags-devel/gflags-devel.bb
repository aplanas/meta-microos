SUMMARY = "Development files for the dynamic gflags library"
DESCRIPTION = "This package contains all necessary include files and the dynamic libraries \
needed for developing applications."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "gflags-devel-2.2.2-3.1.aarch64.rpm"
RPM_HASH = "fc732b8c48efc74a7ed1e9ed71f27b2a0f1b35c37c7fe4a5dfa354a0cc0029edc819818a2d3af5696c777d5fd0b91e8169e91ee7a9f0d2c5fd83243d83db32cb"

RPROVIDES:${PN} += "cmake(gflags) \
gflags-devel \
gflags-devel(aarch-64) \
pkgconfig(gflags)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgflags2_2"

inherit rpm
