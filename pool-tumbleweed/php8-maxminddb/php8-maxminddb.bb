SUMMARY = "PHP extension providing access to maxminddb databases"
DESCRIPTION = "This extension provides access to maxminddb databases and is \
a drop-in replacement for MaxMind\\Db\\Reader."
LICENSE = "Apache-2.0"

PV = "1.11.0"

RPM_NAME = "php8-maxminddb-1.11.0-2.4.aarch64.rpm"
RPM_HASH = "8f8ea77694957fe1639f504cd3e5272d16e76372c3bf544fea7fb38e82f603462d8c83f3e990cd704ee6cddb03d5df6a4101aed6c96fcadfada6f0593f6b367c"

RPROVIDES:${PN} += "config(php8-maxminddb) \
php-maxminddb \
php8-maxminddb \
php8-maxminddb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmaxminddb.so.0()(64bit) \
php(api) \
php(zend-abi)"

inherit rpm
