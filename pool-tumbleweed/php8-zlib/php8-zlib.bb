SUMMARY = "Zlib compression support for PHP"
DESCRIPTION = "This module enables to transparently read and write gzip (.gz) \
compressed files, through versions of most of the filesystem \
functions which work with gzip-compressed files (and uncompressed \
files, too, but not with sockets)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-zlib-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "ee68e2ec638a6e9b04fe161b261f7b898d158bd1a9bfec6241d07369a8616cab64141ef13ece3c34fdb1c1c340f5db433c480362fe52344540eac2b212b6a1e5"

RPROVIDES:${PN} += "config-php8-zlib \
php-zlib \
php8-zlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
php"

inherit rpm
