SUMMARY = "A Suite of Libraries and Programs to Access Microsoft Access Databases"
DESCRIPTION = "Mdbtools contains: \
mdb-dump -- simple hex dump utility for looking at mdb files \
mdb-schema -- prints DDL for the specified table \
mdb-export -- export table to CSV format \
mdb-tables -- a simple dump of table names to be used with shell scripts \
mdb-header -- generates a C header to be used in exporting mdb data to a C prog \
mdb-parsecvs -- generates a C program given a CSV file made with mdb-export \
mdb-sql -- demo SQL engine program \
mdb-ver -- print version of database"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "mdbtools-1.0.0-1.8.aarch64.rpm"
RPM_HASH = "06d2c1f7b3048329569e9e08d7661ff5f88e758a97ac67edac4857511fdf4ff7feda223d38e779ee8816f8c03ff4c2ac9f75f7fcd0d23183e9d0da8deea00067"

RPROVIDES:${PN} += "mdbtools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmdb.so.3 \
libmdbsql.so.3 \
libreadline.so.8"

inherit rpm
