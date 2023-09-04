SUMMARY = "Database abstraction layer for PHP"
DESCRIPTION = "This is a general abstraction layer for several file-based databases. \
As such, functionality is limited to a common subset of features \
supported by modern databases such as Sleepycat Software's DB2. (This \
is not to be confused with IBM's DB2 software, which is supported \
through the ODBC functions.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-dba-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "f5fef3aae4d5332e5676c5d5ac3bc584be441ad6c743113f146f3e4d73e78b8dc3d45e971c1f1e812e7ac7f00efdac253ebea38c26f28e47d062c1dbc810a584"

RPROVIDES:${PN} += "config-php8-dba \
php-dba \
php8-dba"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
liblmdb-0.9.30.so \
php"

inherit rpm
