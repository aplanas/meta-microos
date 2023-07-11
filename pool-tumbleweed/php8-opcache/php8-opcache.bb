SUMMARY = "Opcode cache extension for PHP"
DESCRIPTION = "OPcache improves PHP performance by storing precompiled script \
bytecode in shared memory, thereby removing the need for PHP to load \
and parse scripts on each request."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-opcache-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "7edb7ce53bdf7f2d6f9e13745ef198ebb56bce729e26120e1ab9bb4bbb805091313ef8e4f944b3a1d30c79fc64a9912674923d91abbe0458a7a8431b943e6676"

RPROVIDES:${PN} += "config-php8-opcache \
php-opcache \
php8-opcache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
