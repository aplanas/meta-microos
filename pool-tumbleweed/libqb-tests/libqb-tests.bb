SUMMARY = "Test suite for libqb"
DESCRIPTION = "The libqb-tests package contains the libqb test suite."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.7+20230607.06c8641"

RPM_NAME = "libqb-tests-2.0.7+20230607.06c8641-1.1.aarch64.rpm"
RPM_HASH = "63dd3fd5580fb60333a0c8213079e4bd37bc106f0629b8fdca6a3301f1d43556dbac682fe235e63eb1574bcb11342adcdf84117b34a233a996b0e5d001841bd0"

RPROVIDES:${PN} += "libqb-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcheck.so.0 \
libqb.so.100"

inherit rpm
