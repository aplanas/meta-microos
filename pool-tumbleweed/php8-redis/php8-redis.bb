SUMMARY = "API for communicating with Redis servers"
DESCRIPTION = "This extension provides an API for communicating with Redis servers"
LICENSE = "PHP-3.01"

PV = "5.3.7"

RPM_NAME = "php8-redis-5.3.7-2.5.aarch64.rpm"
RPM_HASH = "94b4b934531d0174d717187d8ca7263359558f2366e18d8ca60426f21ac2e5b86c263d9dea3a129da80ad3651fffc99e96c12fac4a3a45c20ddf756d798e9d60"

RPROVIDES:${PN} += "config(php8-redis) \
php-redis \
php8-redis \
php8-redis(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
php(api) \
php(zend-abi)"

inherit rpm
