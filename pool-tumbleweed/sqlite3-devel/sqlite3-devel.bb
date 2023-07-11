SUMMARY = "Embeddable SQL Database Engine"
DESCRIPTION = "SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process. \
 \
SQLite is not a client library used to connect to a big database \
server; SQLite is the server. The SQLite library reads and writes \
directly to and from the database files on disk. \
 \
SQLite can be used via the sqlite command-line tool or via any \
application which supports the Qt database plug-ins."
LICENSE = "SUSE-Public-Domain"

PV = "3.42.0"

RPM_NAME = "sqlite3-devel-3.42.0-1.2.aarch64.rpm"
RPM_HASH = "cb4bd7691d3882f789db7bdc2050c20599319a4378b63001ad6250ead6def0593ee462599c5b7c0b87a4e3b8ae353684880adba690942dd8558ac20f38432c90"

RPROVIDES:${PN} += "pkgconfig-sqlite3 \
sqlite-devel \
sqlite3-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsqlite3-0"

inherit rpm
