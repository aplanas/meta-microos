SUMMARY = "SysV Message Queue support for PHP"
DESCRIPTION = "This module provides System V Message Queue support."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-sysvmsg-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "53b1302939ec3e67c0f4db0abf3a85f05edbb2a39d468ebf32469486338352c069b5027dfe21d641e018821a319f4d36b5b760ae40287b89cf09e1624949bf0a"

RPROVIDES:${PN} += "config(php8-sysvmsg) \
php-sysvmsg \
php8-sysvmsg \
php8-sysvmsg(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
php"

inherit rpm
