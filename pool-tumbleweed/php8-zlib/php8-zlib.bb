SUMMARY = "Zlib compression support for PHP"
DESCRIPTION = "This module enables to transparently read and write gzip (.gz) \
compressed files, through versions of most of the filesystem \
functions which work with gzip-compressed files (and uncompressed \
files, too, but not with sockets)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-zlib-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "5b990a60b288a6d97b8d23cdc0d6bcdb8ddcbb00c254d919fc1735263498350e3615bf749c120997e4c4556489ce5f33d82b98367931912427903c96c99a5bc1"

RPROVIDES:${PN} += "config-php8-zlib \
php-zlib \
php8-zlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
php"

inherit rpm
