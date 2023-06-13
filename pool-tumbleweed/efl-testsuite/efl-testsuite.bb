SUMMARY = "EFL testsuite"
DESCRIPTION = "Testsuite of EFL package."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-testsuite-1.26.3-30.6.aarch64.rpm"
RPM_HASH = "01cdbec573d65d090c01e0b2796a743eceea98bcdb428d3b3321b6d4195c5281953bfcdf457de1943519eae9cd3e6380b3cdfef76653636a51e73f41efc2f194"

RPROVIDES:${PN} += "efl-testsuite \
efl-testsuite(aarch-64)"

RDEPENDS:${PN} += "libefreet1"

inherit rpm
