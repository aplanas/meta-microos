SUMMARY = "ODBC driver for SQLite"
DESCRIPTION = "ODBC driver for SQLite interfacing SQLite 3.x using the \
unixODBC or iODBC driver managers. For more information refer to \
http://www.sqlite.org    -  SQLite engine \
http://www.unixodbc.org  -  unixODBC Driver Manager \
http://www.iodbc.org     -  iODBC Driver Manager"
LICENSE = "BSD-2-Clause"

PV = "0.9998"

RPM_NAME = "sqliteodbc-0.9998-1.15.aarch64.rpm"
RPM_HASH = "b2516f1ad3011f494b13d4ca532ade7d46933661d4d9d4fd34e8842e791bf42d7ee70ff7d95d5c0318d523d1bb9347d55bc3c22ad45f95596f30bff2ccc52891"

RPROVIDES:${PN} += "libsqlite3-mod-blobtoxy-0.9998.so \
libsqlite3-mod-csvtable-0.9998.so \
libsqlite3-mod-impexp-0.9998.so \
libsqlite3-mod-xpath-0.9998.so \
libsqlite3-mod-zipfile-0.9998.so \
libsqlite3odbc-0.9998.so \
sqliteodbc"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
libxml2.so.2 \
libz.so.1 \
unixODBC"

inherit rpm
