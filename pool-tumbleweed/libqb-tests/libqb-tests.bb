SUMMARY = "Test suite for libqb"
DESCRIPTION = "The libqb-tests package contains the libqb test suite."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8+20230721.002171b"

RPM_NAME = "libqb-tests-2.0.8+20230721.002171b-1.1.aarch64.rpm"
RPM_HASH = "5e931f2cee79e7d43e234f5f8fcb8fe08993e9c3a68587560ab4c534054223f14954ba850189e4e2a340b13b74ab839a5bc6160050ec01031b72a8b7a3d83554"

RPROVIDES:${PN} += "libqb-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcheck.so.0 \
libqb.so.100"

inherit rpm
