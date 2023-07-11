SUMMARY = "MySQL database client for PHP"
DESCRIPTION = "PHP functions for access to MySQL database servers."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-mysql-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "5cad02c2e9253ea66b36df474d9cfeb568eca742a1e28840dcc62dba857bc8c4b1db978b78a88df5bacb5251bfc07ccb1005587a4b903429be5c496998e75970"

RPROVIDES:${PN} += "config-php8-mysql \
php-any-db \
php-mysql \
php-mysqli \
php-pdo-mysql \
php8-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-pdo"

inherit rpm
