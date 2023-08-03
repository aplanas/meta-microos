SUMMARY = "Character set conversion functions for PHP"
DESCRIPTION = "This module contains an interface to iconv character set conversion \
facility. With this module, a string represented by a local character \
set can be turned into another character set, which may be the \
Unicode character set. Supported character sets depend on the iconv \
implementation of your system."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-iconv-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "ae48486bb828452edf6a1857a8f9c93622c2b8e2bea6f6f353c9ea4bfa80451f9d5ce948c42fa770945980d8c72550e1229a421c8a15fbcec6cb5ab3a5864c8a"

RPROVIDES:${PN} += "config-php8-iconv \
php-iconv \
php8-iconv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
