SUMMARY = "ODBC driver for SQLite"
DESCRIPTION = "ODBC driver for SQLite interfacing SQLite 3.x using the \
unixODBC or iODBC driver managers. For more information refer to \
http://www.sqlite.org    -  SQLite engine \
http://www.unixodbc.org  -  unixODBC Driver Manager \
http://www.iodbc.org     -  iODBC Driver Manager"
LICENSE = "BSD-2-Clause"

PV = "0.9998"

RPM_NAME = "sqliteodbc-0.9998-1.16.aarch64.rpm"
RPM_HASH = "ad6a62eba2abf89edd25fb9d14d8c173b45c42015fc0cb607c84f5f47c36cc5c667e9c89ba75b76ed718716623b46841583231004464cae8a6c464b4f2c58660"

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
