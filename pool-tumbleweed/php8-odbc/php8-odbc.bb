SUMMARY = "ODBC extension for PHP"
DESCRIPTION = "This module adds Open Database Connectivity (ODBC) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-odbc-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "b83d1ac0a6ebb6c42527b27d3e56b6067aa816fd30c897b63eed21a14ef4c47fd8eb15dd44b64557563e301a5c0fa0d9f9538dc315879c0bb77bf8d7595ae1a3"

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
