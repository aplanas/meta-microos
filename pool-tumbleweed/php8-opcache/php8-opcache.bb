SUMMARY = "Opcode cache extension for PHP"
DESCRIPTION = "OPcache improves PHP performance by storing precompiled script \
bytecode in shared memory, thereby removing the need for PHP to load \
and parse scripts on each request."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-opcache-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "85535080e47cbc58e3f7f789c96244416a188140830923838c7918cb5d193320292b88997d1bc5c7ab8916e71add5b6394c439abed07f5c1beb3a5985cd207a0"

RPROVIDES:${PN} += "config-php8-opcache \
php-opcache \
php8-opcache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
