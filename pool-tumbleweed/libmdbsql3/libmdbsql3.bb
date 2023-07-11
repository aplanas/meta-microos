SUMMARY = "MDB Tools ODBC driver for unixODBC"
DESCRIPTION = "Contains shared library libmdbsql3 from mdbtools"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libmdbsql3-1.0.0-1.8.aarch64.rpm"
RPM_HASH = "edeef2d901877441dc5005f0eadcaa2aebbd4651cba302899a7fd9ab5014b706c57d393b7a086a9a1f5c8c36917831ab76163d070a8bc385a09773dd08ccc1e7"

RPROVIDES:${PN} += "libmdbsql.so.3 \
libmdbsql3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmdb.so.3"

inherit rpm
