SUMMARY = "SysV Message Queue support for PHP"
DESCRIPTION = "This module provides System V Message Queue support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-sysvmsg-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "f19442afef380c6dd7a0d2ea744095afdecefffa3859aaa6a49c73f718b1e6f562fc6677a09d2b89937fabe555e9f596934f8a57a1a666861ee47bc71723655b"

RPROVIDES:${PN} += "config-php8-sysvmsg \
php-sysvmsg \
php8-sysvmsg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
