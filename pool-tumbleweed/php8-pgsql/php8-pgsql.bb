SUMMARY = "PostgreSQL database client for PHP"
DESCRIPTION = "PHP functions for access to PostgreSQL database servers. It includes \
both traditional pgsql and pdo_pgsql drivers."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-pgsql-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "ea50d88dff15d6650fb1c5685c4588e7ec0c6b00789661b427d950e3587f28a03cc49099791367a12f63b23472f45281189a217a46e5020c8a1992e9953619b0"

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
