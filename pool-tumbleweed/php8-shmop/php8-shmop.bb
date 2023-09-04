SUMMARY = "Alternate, low-level shared memory implementation for PHP"
DESCRIPTION = "An extension created as an alternative to the sysvmsg module."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-shmop-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "0c9d25f64548a21ff7b4e18fd09b2316ba953e2cea9243a07ae8ae7da6590009462fe779aab528feed4bb17da59f961b6b5ac21bf0f849eeeeedc26ac43fb756"

RPROVIDES:${PN} += "config-php8-shmop \
php-shmop \
php8-shmop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
