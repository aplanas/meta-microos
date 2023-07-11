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

RPM_NAME = "sqlite3-3.42.0-1.2.aarch64.rpm"
RPM_HASH = "8f48bf763ddeca11b2a53c76fa234f835cbb4653e6df8348ce060d7bc741a5534e9a59489e55fd1cc9e64a10278b765e6e77f1d39c8c956942efbaaa886f4838"

RPROVIDES:${PN} += "sqlite \
sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8 \
libz.so.1"

inherit rpm
