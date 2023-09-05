SUMMARY = "Alternate, low-level shared memory implementation for PHP"
DESCRIPTION = "An extension created as an alternative to the sysvmsg module."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-shmop-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "dc0d931eed195aedfa7c599bdfaa2eba87b284b31d5ebad93d03fa542ed43e0eadc58bc0a999f6360ee1005dfa4f191ef0eaa079c8f91b29a22939a5d0a829bc"

RPROVIDES:${PN} += "config-php8-shmop \
php-shmop \
php8-shmop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
