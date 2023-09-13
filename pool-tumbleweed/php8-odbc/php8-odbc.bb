SUMMARY = "ODBC extension for PHP"
DESCRIPTION = "This module adds Open Database Connectivity (ODBC) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-odbc-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "3fe30e483e8be6629d82dd64c72ec7bd9592b02c413e76916cc5d7e5e219aea3ead4e4e81732dfb2d64cf2f4a6505503a80e96d2c1b7048d4aff4248d0df9f06"

RPROVIDES:${PN} += "config-php8-odbc \
php-odbc \
php-pdo-odbc \
php8-odbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libodbc.so.2 \
php \
php-pdo"

inherit rpm
