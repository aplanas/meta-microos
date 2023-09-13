SUMMARY = "PostgreSQL database client for PHP"
DESCRIPTION = "PHP functions for access to PostgreSQL database servers. It includes \
both traditional pgsql and pdo_pgsql drivers."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-pgsql-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "0b979e83ae65e4e27f9ebc00e85227b60f2d18a0fd11f51b94ec615809dbf032f8560ea3df56584202c0f2e156244102ef48203a944336d9a0117605755f3e58"

RPROVIDES:${PN} += "config-php8-pgsql \
php-any-db \
php-pdo-pgsql \
php-pgsql \
php8-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
php \
php-pdo"

inherit rpm
