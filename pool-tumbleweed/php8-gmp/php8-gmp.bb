SUMMARY = "Bignum extension for PHP"
DESCRIPTION = "PHP functions for work with arbitrary-length integers using the GNU MP \
library."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-gmp-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "0ef9a44ce87c1d44cf31ec8e1fe211b411bcf9e8ec43db66d78d8e798495961ea1ad087ddfeb7c145815838ac7a3c7f214e9d7a1ab36cac570401e1cbd4e12da"

RPROVIDES:${PN} += "config-php8-gmp \
php-gmp \
php8-gmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
php"

inherit rpm
