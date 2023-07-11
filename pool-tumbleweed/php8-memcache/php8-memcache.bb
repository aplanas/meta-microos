SUMMARY = "PHP Memcache client Extension"
DESCRIPTION = "Memcached is a caching daemon designed especially for \
dynamic web applications to decrease database load by \
storing objects in memory. \
This extension allows you to work with memcached through \
handy OO and procedural interfaces. \
The extension allows use to store sessions in memcached \
via memcache."
LICENSE = "PHP-3.0"

PV = "8.2"

RPM_NAME = "php8-memcache-8.2-1.3.aarch64.rpm"
RPM_HASH = "7475f8bfc28f84d94f8da69aea8ff1d85c6dcaa151825c1511082695bdfefd50bf48907afc0a3a72f4a4f141ee826f1392ead289b0ccc7dc252631df54e61405"

RPROVIDES:${PN} += "config-php8-memcache \
php8-memcache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
php-api \
php-zend-abi"

inherit rpm
