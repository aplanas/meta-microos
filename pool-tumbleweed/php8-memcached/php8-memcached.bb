SUMMARY = "PHP MemcacheD client Extension"
DESCRIPTION = "This extension uses libmemcached library to provide API for \
communicating with memcached servers."
LICENSE = "PHP-3.01"

PV = "3.2.0"

RPM_NAME = "php8-memcached-3.2.0-4.3.aarch64.rpm"
RPM_HASH = "66f697269468e8411be991594801b72d329c80e1774eaba96ebbe7c1edfdc7b8d28475faa92bdc4fcbef563f2fae286afdde6376d08f4a82997d8296f702a966"

RPROVIDES:${PN} += "config(php8-memcached) \
php8-memcached \
php8-memcached(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfastlz.so.1()(64bit) \
libmemcached.so.11()(64bit) \
libsasl2.so.3()(64bit) \
libz.so.1()(64bit) \
php(api) \
php(zend-abi)"

inherit rpm
