SUMMARY = "POSIX functions for PHP"
DESCRIPTION = "This module contains an interface to those functions defined in the \
IEEE 1003.1 (POSIX.1) standards document which are not accessible \
through other means."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-posix-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "b9ec0905dddf058493f65dce2a7bba505882992a9e7a747579bde54ac6fe676f1505266a3689ada80758aad66993dbb29669858d8565d62c89ac0f2477c2f3c9"

RPROVIDES:${PN} += "config-php8-posix \
php-posix \
php8-posix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
