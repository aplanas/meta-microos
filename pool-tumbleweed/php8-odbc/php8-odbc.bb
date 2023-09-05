SUMMARY = "ODBC extension for PHP"
DESCRIPTION = "This module adds Open Database Connectivity (ODBC) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-odbc-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "f9f052362338f55a7b9a5dd9eb29b9f14abf6c35092cfdfaed80ddb6570007ab8e4c86c69d4e260acb420927b3ff40b041eaa0f004645f2c7e2a0e04a2db1b3b"

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
