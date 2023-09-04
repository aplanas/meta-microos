SUMMARY = "Opcode cache extension for PHP"
DESCRIPTION = "OPcache improves PHP performance by storing precompiled script \
bytecode in shared memory, thereby removing the need for PHP to load \
and parse scripts on each request."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-opcache-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "66b588166541bb0a4d0b624d9a71644dc874e81b3191a34edeb8e7359c6dd40da664916cb0f7d2322f9a37856d4cabe5817cf4a0247c6137f60fa6291a6c3d15"

RPROVIDES:${PN} += "config-php8-opcache \
php-opcache \
php8-opcache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
