SUMMARY = "Database abstraction layer for PHP"
DESCRIPTION = "This is a general abstraction layer for several file-based databases. \
As such, functionality is limited to a common subset of features \
supported by modern databases such as Sleepycat Software's DB2. (This \
is not to be confused with IBM's DB2 software, which is supported \
through the ODBC functions.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-dba-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "8b88bebf8955c4ee66822a4b33d8f424f9bc277bc3c76612274822d61fab1f3bbb52e24e918708f5beb13d3c7de645a7d3ee40ac6c1c65546c8e1c269f858a8a"

RPROVIDES:${PN} += "config-php8-dba \
php-dba \
php8-dba"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
liblmdb-0.9.30.so \
php"

inherit rpm
