SUMMARY = "PostgreSQL database client for PHP"
DESCRIPTION = "PHP functions for access to PostgreSQL database servers. It includes \
both traditional pgsql and pdo_pgsql drivers."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-pgsql-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "b3957905c22a7215dbb564af9d498c8948adbe4118af79f473070607f6decfe56f4b314cd5c295dba68eccd752f60c692bcdc063e88eafa6a4065142e483f0f7"

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
