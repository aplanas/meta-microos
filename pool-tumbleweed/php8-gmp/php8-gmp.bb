SUMMARY = "Bignum extension for PHP"
DESCRIPTION = "PHP functions for work with arbitrary-length integers using the GNU MP \
library."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-gmp-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "57fe0863aeb412c1521608adc1791a483b39c8076e8aa04dca51deb143b4ed37791d5e798527f892526e310da0e6c7c001d5555348362ec7fa9ccba544080287"

RPROVIDES:${PN} += "config-php8-gmp \
php-gmp \
php8-gmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
php"

inherit rpm
