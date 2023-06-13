SUMMARY = "MySQL database client for PHP"
DESCRIPTION = "PHP functions for access to MySQL database servers."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-mysql-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "885be2fe674a71096d69df31a6bc5da4d0c42bba1c20b362d5a4924b1a85b56fc3378b08dc5276770bf5777b2d184fa6c29aa6cc09f4438ddc8e6ba92a887547"

RPROVIDES:${PN} += "config(php8-mysql) \
php-mysql \
php-mysqli \
php-pdo_mysql \
php8-mysql \
php8-mysql(aarch-64) \
php_any_db"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
php \
php-pdo"

inherit rpm
