SUMMARY = "Tests for Cockpit"
DESCRIPTION = "This package contains tests and files used while testing Cockpit. \
These files are not required for running Cockpit."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-tests-276.1-4.4.aarch64.rpm"
RPM_HASH = "291aa3b61f8d8d332231d6a3fb7d3d55a807bf6921ca30e1d801eee57dfe65ee655be2d4f8b3e149136760d62c176de48e8918f218416a3e1399fa02831105f1"

RPROVIDES:${PN} += "cockpit-test-assets \
cockpit-tests"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-system \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
openssh-clients"

inherit rpm
