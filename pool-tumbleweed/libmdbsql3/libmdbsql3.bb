SUMMARY = "MDB Tools ODBC driver for unixODBC"
DESCRIPTION = "Contains shared library libmdbsql3 from mdbtools"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libmdbsql3-1.0.0-1.7.aarch64.rpm"
RPM_HASH = "db412d283b2f36fd28bc57144f74add3bff9d04e1f7c3dfe919157b63db7681e5249429b9c48ce4462de473513d06cccf433ef29d799209967eecc203d3a2f92"

RPROVIDES:${PN} += "libmdbsql.so.3 \
libmdbsql3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmdb.so.3"

inherit rpm
