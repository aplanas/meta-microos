SUMMARY = "POSIX functions for PHP"
DESCRIPTION = "This module contains an interface to those functions defined in the \
IEEE 1003.1 (POSIX.1) standards document which are not accessible \
through other means."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-posix-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "a66bdc4ed02daffba57796e066451d2608490c84408c9f94964185dc2d9988e04c8476f5544fc222a3ee7b1b22c83e9a21f2d20c67e7aaa45054f6ab6c7fc2cd"

RPROVIDES:${PN} += "config-php8-posix \
php-posix \
php8-posix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
