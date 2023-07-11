SUMMARY = "Database abstraction layer for PHP"
DESCRIPTION = "This is a general abstraction layer for several file-based databases. \
As such, functionality is limited to a common subset of features \
supported by modern databases such as Sleepycat Software's DB2. (This \
is not to be confused with IBM's DB2 software, which is supported \
through the ODBC functions.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-dba-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "569919119da881ba4af8e6b1ead7715d5ac23f28223512700d6f250cdb3394261822bd609ace1baa89d727403fa045c137df4f8cf2fb02333cfe0c314f4fcd36"

RPROVIDES:${PN} += "config-php8-dba \
php-dba \
php8-dba"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
liblmdb-0.9.30.so \
php"

inherit rpm
