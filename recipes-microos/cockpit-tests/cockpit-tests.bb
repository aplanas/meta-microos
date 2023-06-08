SUMMARY = "Tests for Cockpit"
DESCRIPTION = "This package contains tests and files used while testing Cockpit. \
These files are not required for running Cockpit."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-tests-276.1-4.3.aarch64.rpm"
RPM_HASH = "16fcd40db7d6a0ac157a94a867da979510ac10cbf22af70dad8661b2c674b168527827daf72aecdc479bee8e3dcfb8d30e8aa74b1551e825eceff4751b055d23"

RPROVIDES:${PN} += "cockpit-test-assets cockpit-tests cockpit-tests(aarch-64)"
RDEPENDS:${PN} += "cockpit-bridge cockpit-system ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) openssh-clients"

inherit rpm
