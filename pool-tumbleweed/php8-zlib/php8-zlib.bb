SUMMARY = "Zlib compression support for PHP"
DESCRIPTION = "This module enables to transparently read and write gzip (.gz) \
compressed files, through versions of most of the filesystem \
functions which work with gzip-compressed files (and uncompressed \
files, too, but not with sockets)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-zlib-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "2591663f1077afa045174286a81e788b0d2328be6267ecd0e29671926c57e0ad7341387ac7d8614153cf022036cc3858fe5c931f4789f57df540e64ba69f7f4f"

RPROVIDES:${PN} += "config-php8-zlib \
php-zlib \
php8-zlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
php"

inherit rpm
