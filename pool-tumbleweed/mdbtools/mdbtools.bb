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

RPM_NAME = "mdbtools-1.0.0-1.7.aarch64.rpm"
RPM_HASH = "b4db682891ccc9fa02632aec86ffbe60aa754cdbc610f71d25f9095bcab973b07703107709369f696d4c9607724f52f914f7f56f7b4f3a9000808d9a88d4b59f"

RPROVIDES:${PN} += "mdbtools \
mdbtools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libmdb.so.3()(64bit) \
libmdbsql.so.3()(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
