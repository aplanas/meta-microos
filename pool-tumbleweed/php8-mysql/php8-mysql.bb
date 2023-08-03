SUMMARY = "MySQL database client for PHP"
DESCRIPTION = "PHP functions for access to MySQL database servers."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-mysql-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "49be462ddd72ecedf9b1de458e463c05b4404bf9234b4cd1c85c0aa5e2f5185e7e6e404dbe25cdc217dc6d9094e98b645095180c7e793ef3e97bc3ec01c3b86b"

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
