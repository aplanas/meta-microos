SUMMARY = "MySQL database client for PHP"
DESCRIPTION = "PHP functions for access to MySQL database servers."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-mysql-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "d8a9fa0cb2dc1e7b709b344e0271ecf3cebf22cc8f66629782194ab2a4ee57975a35c0809e3785c66568458dc1e991df8a62004cba6c45f5ee4ace85f61f1131"

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
