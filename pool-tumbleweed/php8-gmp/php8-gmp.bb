SUMMARY = "Bignum extension for PHP"
DESCRIPTION = "PHP functions for work with arbitrary-length integers using the GNU MP \
library."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-gmp-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "d87e9c2e06fda99c34607b4c5e83b77a539d1f29652f22a8e26b6ae51f8913d77fcfd8638cc64da16fbf3b7dd9b6ac37acdbaf3a8036ef77ec26e38a0e665041"

RPROVIDES:${PN} += "config-php8-gmp \
php-gmp \
php8-gmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
php"

inherit rpm
