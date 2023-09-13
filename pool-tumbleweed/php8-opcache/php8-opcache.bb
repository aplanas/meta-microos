SUMMARY = "Opcode cache extension for PHP"
DESCRIPTION = "OPcache improves PHP performance by storing precompiled script \
bytecode in shared memory, thereby removing the need for PHP to load \
and parse scripts on each request."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-opcache-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "b7fa065be904024a6d29672e46f65a1342414fd5601f0caea014e092cee1e582d51fd7dc2b6bf2297632622b99476f8c2b395fa849acee27210c5183abf290e3"

RPROVIDES:${PN} += "config-php8-opcache \
php-opcache \
php8-opcache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
