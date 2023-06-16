SUMMARY = "Integration tests for snapper"
DESCRIPTION = "Tests to be run in a scratch machine to test that snapper operates as expected."
LICENSE = "GPL-2.0-only"

PV = "0.10.4"

RPM_NAME = "snapper-testsuite-0.10.4-13.2.aarch64.rpm"
RPM_HASH = "90386ba28c2d0195c3da1966ed94a18afbfc6a8c9565e2d294ed88e4b5a047d64262553ae0f21f0902a693564a5bf1da3c3c8b7eb8bf9b4b295a787b178d5cf9"

RPROVIDES:${PN} += "snapper-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsnapper.so.7 \
libstdc++.so.6"

inherit rpm
