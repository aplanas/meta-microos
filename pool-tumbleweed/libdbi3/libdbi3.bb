SUMMARY = "Database Independent Abstraction Layer for C"
DESCRIPTION = "libdbi implements a database-independent abstraction layer in C, \
similar to the DBI/DBD layer in Perl. Writing one generic set of \
code, programmers can leverage the power of multiple databases and \
multiple simultaneous database connections by using this framework."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0.g33"

RPM_NAME = "libdbi3-0.9.0.g33-4.10.aarch64.rpm"
RPM_HASH = "3cdb28748e5a9dacbfd087237f27faa0f2dc74462feae869c13dfd1f0fede070157733b02fae2d1651a2dd118f68441429ca00ae1972aa6e6ee88d4a5a1a146e"

RPROVIDES:${PN} += "libdbi.so.3()(64bit) \
libdbi.so.3(ABI_3)(64bit) \
libdbi3 \
libdbi3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
