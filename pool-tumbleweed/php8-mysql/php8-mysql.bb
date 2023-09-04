SUMMARY = "MySQL database client for PHP"
DESCRIPTION = "PHP functions for access to MySQL database servers."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-mysql-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "0fbe963635d880b9148423917b5dfcd61080bc81015c24d037f9bd40a6d4d54ff4f10c6b00d0333f6c1003292a584ff270456bb49b5e52348abed245e1963ba9"

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
