SUMMARY = "MySQL database client for PHP"
DESCRIPTION = "PHP functions for access to MySQL database servers."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-mysql-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "e0282b91da0bad67a93a609cefe7cc80b3c80f6ef827825e41350668e9696ad61fb1e9d2e8690f57f47791c3174262cb5c9b7b5a8c16641cd78c7e607ad6c6e3"

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
