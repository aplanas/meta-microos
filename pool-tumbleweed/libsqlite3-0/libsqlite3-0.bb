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

RPM_NAME = "libsqlite3-0-3.42.0-1.1.aarch64.rpm"
RPM_HASH = "a72123b561a47af27b9c08e70e3d06a68c313da0b0046b9b7aa30f3e447db74f80d60a4a7224ea09ffa7281534a708cec59c6292b3b60009f8f4d171451fb6ff"

RPROVIDES:${PN} += "libsqlite3-0 \
libsqlite3-0(aarch-64) \
libsqlite3.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
