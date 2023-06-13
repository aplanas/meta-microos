SUMMARY = "Bignum extension for PHP"
DESCRIPTION = "PHP functions for work with arbitrary-length integers using the GNU MP \
library."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-gmp-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "f3165c0bf911fd89314ce2e9978ba4456c27ff4aa454c05db1153ac3090044e3aa74fc8c0dd2a46a5d0dff7d016b1ffe724e3d519af592fc06f5ddd615ac5246"

RPROVIDES:${PN} += "config(php8-gmp) \
php-gmp \
php8-gmp \
php8-gmp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
php"

inherit rpm
