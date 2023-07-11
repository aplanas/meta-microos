SUMMARY = "Zlib compression support for PHP"
DESCRIPTION = "This module enables to transparently read and write gzip (.gz) \
compressed files, through versions of most of the filesystem \
functions which work with gzip-compressed files (and uncompressed \
files, too, but not with sockets)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-zlib-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "12576476449dc398b7548d3dc06a6ff240da99ed70d9182b5c9392ce0406f8e17670c4e74cfde2118b2d6f129b58546625552e5a2a81281a878c95d2adcf2024"

RPROVIDES:${PN} += "config-php8-zlib \
php-zlib \
php8-zlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
php"

inherit rpm
