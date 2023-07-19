SUMMARY = "Integration tests for snapper"
DESCRIPTION = "Tests to be run in a scratch machine to test that snapper operates as expected."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "snapper-testsuite-0.10.5-2.1.aarch64.rpm"
RPM_HASH = "ce7a580dc553e31f058d078d8d7aabd6853f666c794a84306b580256ba2fa3e043211e9f160afcf422fae480e99979d3f5a0c4cc3842d072457e5c3f05b74dec"

RPROVIDES:${PN} += "snapper-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsnapper.so.7 \
libstdc++.so.6"

inherit rpm
