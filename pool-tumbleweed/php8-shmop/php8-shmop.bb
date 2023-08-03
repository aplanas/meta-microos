SUMMARY = "Alternate, low-level shared memory implementation for PHP"
DESCRIPTION = "An extension created as an alternative to the sysvmsg module."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-shmop-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "8d8389c36e2179dbd03cee50b406e9f6964a5d8e390ad10008a4f67d18b6d7b224e154877405cebdbb0ee24406db203eab10aad06f2c308a90c2639b365708de"

RPROVIDES:${PN} += "config-php8-shmop \
php-shmop \
php8-shmop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
