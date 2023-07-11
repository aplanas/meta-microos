SUMMARY = "Shared libraries for the Embeddable SQL Database Engine"
DESCRIPTION = "This package contains the shared libraries for the Embeddable SQL \
Database Engine. \
 \
SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process. \
 \
SQLite is not a client library used to connect to a big database \
server. SQLite is a server and the SQLite library reads and writes \
directly to and from the database files on disk. \
 \
SQLite can be used via the sqlite command line tool or via any \
application that supports the Qt database plug-ins."
LICENSE = "SUSE-Public-Domain"

PV = "3.42.0"

RPM_NAME = "libsqlite3-0-3.42.0-1.2.aarch64.rpm"
RPM_HASH = "1d1d3a4b92cf8b05a58e296e1e6d73243e501403fdb7419c0c60729aae765ee73e03759ad8955446117389a02ad7d33f7a92786990f0826fb67406ba382dad03"

RPROVIDES:${PN} += "libsqlite3-0 \
libsqlite3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
