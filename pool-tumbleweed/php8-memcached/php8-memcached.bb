SUMMARY = "PHP MemcacheD client Extension"
DESCRIPTION = "This extension uses libmemcached library to provide API for \
communicating with memcached servers."
LICENSE = "PHP-3.01"

PV = "3.2.0"

RPM_NAME = "php8-memcached-3.2.0-4.4.aarch64.rpm"
RPM_HASH = "90461950fb4573f52715810279209684a8f0567c307a17a59f42093112842e6895904981199b1772d5a9953a8047edc4178937ebbcd42c1cae33df1a70939573"

RPROVIDES:${PN} += "config-php8-memcached \
php8-memcached"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfastlz.so.1 \
libmemcached.so.11 \
libsasl2.so.3 \
libz.so.1 \
php-api \
php-zend-abi"

inherit rpm
