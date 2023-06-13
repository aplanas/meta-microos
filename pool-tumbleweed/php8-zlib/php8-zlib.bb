SUMMARY = "Zlib compression support for PHP"
DESCRIPTION = "This module enables to transparently read and write gzip (.gz) \
compressed files, through versions of most of the filesystem \
functions which work with gzip-compressed files (and uncompressed \
files, too, but not with sockets)."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-zlib-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "671670a77319aab13b25f5c993ca4e8252a1de804530e07379048c41acd04a08e6f7fc1e0ededc302de6c69d2022e469a9d4471fce153c7b4ee170ef67083df2"

RPROVIDES:${PN} += "config(php8-zlib) \
php-zlib \
php8-zlib \
php8-zlib(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit) \
php"

inherit rpm
