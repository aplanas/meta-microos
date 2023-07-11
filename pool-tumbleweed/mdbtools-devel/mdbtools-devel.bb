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

RPM_NAME = "mdbtools-devel-1.0.0-1.8.aarch64.rpm"
RPM_HASH = "9918cadf4fe85d52ffb515b219809fa061719f3995d7eb960eaa4ab6d2d0d4b726ff80417feb007afd7b1bd8deb2d142205742aabf3f6b7493f469490e357af2"

RPROVIDES:${PN} += "libmdbodbc.so \
libmdbodbcW.so \
mdbtools-devel \
pkgconfig-libmdb \
pkgconfig-libmdbsql"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
flex \
glib2-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmdb.so.3 \
libmdb3 \
libmdbsql.so.3 \
libmdbsql3 \
libodbcinst.so.2 \
pkgconfig-glib-2.0 \
pkgconfig-libmdb \
unixODBC-devel"

inherit rpm
