SUMMARY = "ODBC extension for PHP"
DESCRIPTION = "This module adds Open Database Connectivity (ODBC) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-odbc-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "a567b5503b6e37dc46b6f478a632df5cd62a2022ef311a542350e9f2b6f386246386bea56c38cfecaefe616f8d8632b36eb44fe93a7fa6f98316abc08893cbf6"

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
