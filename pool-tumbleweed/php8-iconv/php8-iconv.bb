SUMMARY = "Character set conversion functions for PHP"
DESCRIPTION = "This module contains an interface to iconv character set conversion \
facility. With this module, a string represented by a local character \
set can be turned into another character set, which may be the \
Unicode character set. Supported character sets depend on the iconv \
implementation of your system."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-iconv-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "9457e2d34927f5e3677100922fc854f47ad5bbb7219319dce11fdb85a2ef878295605c2954f78a4d90f4e94a5535a1c7168a0ae204b74605b2a1723f77f3af5a"

RPROVIDES:${PN} += "config-php8-iconv \
php-iconv \
php8-iconv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
