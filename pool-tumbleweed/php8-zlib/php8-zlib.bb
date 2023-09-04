SUMMARY = "Zlib compression support for PHP"
DESCRIPTION = "This module enables to transparently read and write gzip (.gz) \
compressed files, through versions of most of the filesystem \
functions which work with gzip-compressed files (and uncompressed \
files, too, but not with sockets)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-zlib-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "b88ba3e19cf3a15e17d8fddb9e7bdccd54c8e0e8af1c261284606e3b8049019c883d5d824b14b4843c8d07dab99169b089ef2b5e2c45b3053602f13940f0525d"

RPROVIDES:${PN} += "config-php8-zlib \
php-zlib \
php8-zlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
php"

inherit rpm
