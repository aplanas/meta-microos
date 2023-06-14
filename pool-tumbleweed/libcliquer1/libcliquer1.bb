SUMMARY = "C library for finding cliques in graphs"
DESCRIPTION = "Cliquer is a set of C routines for finding cliques in an arbitrary \
weighted graph and uses an exact branch-and-bound algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "1.22"

RPM_NAME = "libcliquer1-1.22-2.7.aarch64.rpm"
RPM_HASH = "d22375bb9bd3f8d454edd92ca0d4ad02c36a0e24c256712640156c67fc44c7d962ca2d70be70c5cf9c92e2ab2f1bce5a7635de7ebed68b1794c4eead5b931a3e"

RPROVIDES:${PN} += "libcliquer.so.1 \
libcliquer1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
