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

RPROVIDES:${PN} += "libsqlite3_mod_blobtoxy-0.9998.so()(64bit) \
libsqlite3_mod_csvtable-0.9998.so()(64bit) \
libsqlite3_mod_impexp-0.9998.so()(64bit) \
libsqlite3_mod_xpath-0.9998.so()(64bit) \
libsqlite3_mod_zipfile-0.9998.so()(64bit) \
libsqlite3odbc-0.9998.so()(64bit) \
sqliteodbc \
sqliteodbc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsqlite3.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
unixODBC"

inherit rpm
