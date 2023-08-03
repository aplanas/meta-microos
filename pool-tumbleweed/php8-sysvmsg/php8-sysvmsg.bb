SUMMARY = "SysV Message Queue support for PHP"
DESCRIPTION = "This module provides System V Message Queue support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-sysvmsg-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "4c3739847fe5698ca6ecbcb419223ae8bb04cd76e64e4c6f8fa0202f5983026187da675a8eeba6c755e30d37bbfa5a21e00db48a9f71d86cfbd45595bf2efe95"

RPROVIDES:${PN} += "config-php8-sysvmsg \
php-sysvmsg \
php8-sysvmsg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
