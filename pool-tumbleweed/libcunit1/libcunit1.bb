SUMMARY = "CUnit shared library"
DESCRIPTION = "CUnit is a unit testing framework for C. \
This package installs the CUnit shared library."
LICENSE = "LGPL-2.0"

PV = "2.1.3"

RPM_NAME = "libcunit1-2.1.3-5.26.aarch64.rpm"
RPM_HASH = "711413cf7143fd34008d14a9c8ed81b1a075e0d343b48e2eeb6753501600dfca542409bde067d53c5a53d2e7dc8391287ca22a90addd2f51904a0182711d48dd"

RPROVIDES:${PN} += "libcunit.so.1 \
libcunit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
