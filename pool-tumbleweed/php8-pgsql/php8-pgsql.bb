SUMMARY = "PostgreSQL database client for PHP"
DESCRIPTION = "PHP functions for access to PostgreSQL database servers. It includes \
both traditional pgsql and pdo_pgsql drivers."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-pgsql-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "4860a8990be69fb754fbd6a38038222e71dce5c843bf3931de2769b4b527a8cce34512c9cdc8bc5d87fa989dd90b7d31c27bcfc9616121a87db48804b8aa24a5"

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
