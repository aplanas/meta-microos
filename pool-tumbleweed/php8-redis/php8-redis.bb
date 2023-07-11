SUMMARY = "API for communicating with Redis servers"
DESCRIPTION = "This extension provides an API for communicating with Redis servers"
LICENSE = "PHP-3.01"

PV = "5.3.7"

RPM_NAME = "php8-redis-5.3.7-2.7.aarch64.rpm"
RPM_HASH = "a3947e64b8a126b7a872f21ae0eedfe5b879eba7437c783cc421604f959336fce4559bdaf01fe258cfd9e9d4dadac79e0f397b1745589deb9bed7e9433ca8b11"

RPROVIDES:${PN} += "config-php8-redis \
php-redis \
php8-redis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php-api \
php-zend-abi"

inherit rpm
