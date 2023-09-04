SUMMARY = "ODBC extension for PHP"
DESCRIPTION = "This module adds Open Database Connectivity (ODBC) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-odbc-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "1a33222ca182d414012f256580bfeeba41f9402bacd587b91071bac40e05d8d065cc233d27591e50d42a330b60d7e606cba812ba0599923953ea035824e57b66"

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
