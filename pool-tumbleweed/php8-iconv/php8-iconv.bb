SUMMARY = "Character set conversion functions for PHP"
DESCRIPTION = "This module contains an interface to iconv character set conversion \
facility. With this module, a string represented by a local character \
set can be turned into another character set, which may be the \
Unicode character set. Supported character sets depend on the iconv \
implementation of your system."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-iconv-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "c1957c5349548b18ad90687f2a7b82f01bec00f40fe7fb43c8d50be80a0cd00d33a60dc90913c0acea5de50bcd0a211b4111b1c0d8c94876bc1a6ad41519f0ff"

RPROVIDES:${PN} += "config(php8-iconv) \
php-iconv \
php8-iconv \
php8-iconv(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
php"

inherit rpm
