SUMMARY = "Bignum extension for PHP"
DESCRIPTION = "PHP functions for work with arbitrary-length integers using the GNU MP \
library."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-gmp-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "c6b73ec9e673aa587cf7709904b75ec8fd2be5be9d91dc108ca01165293a8742c61a7548025c01c42b4a343d71118c5c38989d6163709a16fab27e2a273eacc8"

RPROVIDES:${PN} += "config-php8-gmp \
php-gmp \
php8-gmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
php"

inherit rpm
