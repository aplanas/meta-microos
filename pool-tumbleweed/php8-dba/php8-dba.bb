SUMMARY = "Database abstraction layer for PHP"
DESCRIPTION = "This is a general abstraction layer for several file-based databases. \
As such, functionality is limited to a common subset of features \
supported by modern databases such as Sleepycat Software's DB2. (This \
is not to be confused with IBM's DB2 software, which is supported \
through the ODBC functions.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-dba-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "683138ebe2535013bcf7f75712f269fa371a821c87affb5a32a5165a742696785b30d38029b50625c9e9067fc26eede946fc4af0429b19bf881aed263e3ceaeb"

RPROVIDES:${PN} += "config-php8-dba \
php-dba \
php8-dba"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
liblmdb-0.9.30.so \
php"

inherit rpm
