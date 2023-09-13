SUMMARY = "Character set conversion functions for PHP"
DESCRIPTION = "This module contains an interface to iconv character set conversion \
facility. With this module, a string represented by a local character \
set can be turned into another character set, which may be the \
Unicode character set. Supported character sets depend on the iconv \
implementation of your system."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-iconv-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "6750319447db73c0dd85b60964191f9e22c5d0e039fd34a10b8cf12d56d37fb0499aa870886be1ae434772b58b04eb327acac51c51e1d98eca1d23221c8522d3"

RPROVIDES:${PN} += "config-php8-iconv \
php-iconv \
php8-iconv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
