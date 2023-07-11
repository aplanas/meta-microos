SUMMARY = "SQLite back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for SQLite."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_sqlite3-4_0-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "84d04cc20146f0a4855cf3a939d5602e542e2eb30e65aacc80fed63f8244d0ac10df46870b74004488f5e8d03cc169f4a938a05ca3023b0315de601dbac40daa"

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
