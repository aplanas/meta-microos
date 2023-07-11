SUMMARY = "Integration tests for snapper"
DESCRIPTION = "Tests to be run in a scratch machine to test that snapper operates as expected."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "snapper-testsuite-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "2a6839728459c62c9981fa48ae6e1a3612871f8de8ad89eeaa27d3d77a55bf60bcff1f18056cdd89f41a23bc1a009b5f76a8f76bcca4b33500365f04815f7fe0"

RPROVIDES:${PN} += "snapper-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsnapper.so.7 \
libstdc++.so.6"

inherit rpm
