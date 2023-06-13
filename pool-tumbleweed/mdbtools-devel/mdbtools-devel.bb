SUMMARY = "All files necessary for development with the MDB Tools libraries"
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

RPM_NAME = "mdbtools-devel-1.0.0-1.7.aarch64.rpm"
RPM_HASH = "49b8245009f02030eff36bf4e60d99c827a846aa7f3e9570c5fdb58820fcf5c6066024180f2d362f55902fac88d4249302a0e59519581bc05e4656116410d135"

RPROVIDES:${PN} += "libmdbodbc.so()(64bit) \
libmdbodbcW.so()(64bit) \
mdbtools-devel \
mdbtools-devel(aarch-64) \
pkgconfig(libmdb) \
pkgconfig(libmdbsql)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
flex \
glib2-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libmdb.so.3()(64bit) \
libmdb3 \
libmdbsql.so.3()(64bit) \
libmdbsql3 \
libodbcinst.so.2()(64bit) \
pkgconfig(glib-2.0) \
pkgconfig(libmdb) \
unixODBC-devel"

inherit rpm
