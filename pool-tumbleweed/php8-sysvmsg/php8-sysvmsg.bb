SUMMARY = "SysV Message Queue support for PHP"
DESCRIPTION = "This module provides System V Message Queue support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-sysvmsg-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "2b92162f68b3c8d2a5132fe71f692cebde213a8a23edd179c1df1575245fec2d3431ac38cd0f21b41b278eadf987de33d6f5c182118ecf84b12bf716fe38722b"

RPROVIDES:${PN} += "config-php8-sysvmsg \
php-sysvmsg \
php8-sysvmsg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
