SUMMARY = "PostgreSQL database client for PHP"
DESCRIPTION = "PHP functions for access to PostgreSQL database servers. It includes \
both traditional pgsql and pdo_pgsql drivers."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-pgsql-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "2eb8a6e28019e81f09d2e941286a80a519b5327157ba81774a3e4b7a41f0a69fda7fec3fa7ca26b8db50baea6c465f5b7c5ddf1c99e40b2e6a01d03122da4599"

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
