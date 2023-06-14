SUMMARY = "Embeddable SQL Database Engine"
DESCRIPTION = "SQLite is a C library that implements an embeddable SQL database \
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

RPM_NAME = "sqlite3-3.42.0-1.1.aarch64.rpm"
RPM_HASH = "2abe0ae6b101dce00dfb0b68875b2e641d6432b7235685e81ae32cfe6c61c9cf92010985a79e304cf0f7fa61680775c5a8e87970bf8294f4a8dfba1aa9c7ca86"

RPROVIDES:${PN} += "sqlite \
sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8 \
libz.so.1"

inherit rpm
