SUMMARY = "Character set conversion functions for PHP"
DESCRIPTION = "This module contains an interface to iconv character set conversion \
facility. With this module, a string represented by a local character \
set can be turned into another character set, which may be the \
Unicode character set. Supported character sets depend on the iconv \
implementation of your system."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-iconv-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "d7ef301fdb406a4c165539074632c10e003cbd39986532ec4162b412078d7eeec243bfaf949c75c1bf9726005677b5c11ecc7cc4a0227e6f7a1ebda7d841500f"

RPROVIDES:${PN} += "config-php8-iconv \
php-iconv \
php8-iconv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
