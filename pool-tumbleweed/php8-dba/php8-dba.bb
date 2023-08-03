SUMMARY = "Database abstraction layer for PHP"
DESCRIPTION = "This is a general abstraction layer for several file-based databases. \
As such, functionality is limited to a common subset of features \
supported by modern databases such as Sleepycat Software's DB2. (This \
is not to be confused with IBM's DB2 software, which is supported \
through the ODBC functions.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-dba-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "f4f324f12957e2e0c0e5288a3ce51d1a7bf873c227af7f5a174ae9fe1a83f0043747263c013d5ddefcd2f4fec4647c4acffa900dcef0da4504a261d8fb267107"

RPROVIDES:${PN} += "config-php8-dba \
php-dba \
php8-dba"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
liblmdb-0.9.30.so \
php"

inherit rpm
