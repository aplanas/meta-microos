SUMMARY = "Bignum extension for PHP"
DESCRIPTION = "PHP functions for work with arbitrary-length integers using the GNU MP \
library."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-gmp-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "8962927c842aa36bcef39a9c194d606aa84f95f54f868b1fa8040f3b0745ac4036f57fb114263d60a964665e72d514f942b80a405ba39b4a52bc531c61ef2ddd"

RPROVIDES:${PN} += "config-php8-gmp \
php-gmp \
php8-gmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
php"

inherit rpm
