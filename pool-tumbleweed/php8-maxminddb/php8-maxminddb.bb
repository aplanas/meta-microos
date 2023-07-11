SUMMARY = "PHP extension providing access to maxminddb databases"
DESCRIPTION = "This extension provides access to maxminddb databases and is \
a drop-in replacement for MaxMind\\Db\\Reader."
LICENSE = "Apache-2.0"

PV = "1.11.0"

RPM_NAME = "php8-maxminddb-1.11.0-2.5.aarch64.rpm"
RPM_HASH = "cda698c5153bde113e94112ad3b5d03ee120ce55efdecf81cef5c5783ad7d7516a83d0b32fcb8cbcce566823815a865946b209da3bfcfb0e9ac0b29bbd18d80d"

RPROVIDES:${PN} += "config-php8-maxminddb \
php-maxminddb \
php8-maxminddb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
php-api \
php-zend-abi"

inherit rpm
