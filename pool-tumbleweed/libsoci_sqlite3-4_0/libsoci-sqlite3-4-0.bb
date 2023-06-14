SUMMARY = "SQLite back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for SQLite."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_sqlite3-4_0-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "9b6ed97febba4b8275ecdbd78a07a27570bd7202cf8ec213787950a7e55142792ee78ad0d61fdbdb682bb95a310838b7ea32481d7080a72c3d4e4ee42628706d"

RPROVIDES:${PN} += "libsoci-sqlite3-4-0 \
libsoci-sqlite3.so.4.0 \
libsoci4-0-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsoci-core.so.4.0 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
