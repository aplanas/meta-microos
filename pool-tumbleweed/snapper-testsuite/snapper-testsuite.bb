SUMMARY = "Integration tests for snapper"
DESCRIPTION = "Tests to be run in a scratch machine to test that snapper operates as expected."
LICENSE = "GPL-2.0-only"

PV = "0.10.4"

RPM_NAME = "snapper-testsuite-0.10.4-13.2.aarch64.rpm"
RPM_HASH = "90386ba28c2d0195c3da1966ed94a18afbfc6a8c9565e2d294ed88e4b5a047d64262553ae0f21f0902a693564a5bf1da3c3c8b7eb8bf9b4b295a787b178d5cf9"

RPROVIDES:${PN} += "snapper-testsuite \
snapper-testsuite(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libsnapper.so.7()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
