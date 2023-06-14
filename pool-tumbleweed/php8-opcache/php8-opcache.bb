SUMMARY = "Opcode cache extension for PHP"
DESCRIPTION = "OPcache improves PHP performance by storing precompiled script \
bytecode in shared memory, thereby removing the need for PHP to load \
and parse scripts on each request."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-opcache-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "5a9f6f243199fd42188b2440653bf1819ffd0f04706dd8391a7107ed41f17e80c65049d65c8d804a12f2346744bf09d76d97a74df48e4c17fa734796fd7a04f0"

RPROVIDES:${PN} += "config-php8-opcache \
php-opcache \
php8-opcache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
