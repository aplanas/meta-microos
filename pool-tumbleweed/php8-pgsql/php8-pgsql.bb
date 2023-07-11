SUMMARY = "PostgreSQL database client for PHP"
DESCRIPTION = "PHP functions for access to PostgreSQL database servers. It includes \
both traditional pgsql and pdo_pgsql drivers."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-pgsql-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "0c1714c102b6858cc3bed1f39d402a7367c5e6f8cbd3ca1df015552babdff0d317084af05cb5eb49b6be2e210f109b90cde8a4fdbe8068af9a812fbbc934f690"

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
