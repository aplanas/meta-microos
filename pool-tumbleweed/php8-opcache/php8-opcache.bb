SUMMARY = "Opcode cache extension for PHP"
DESCRIPTION = "OPcache improves PHP performance by storing precompiled script \
bytecode in shared memory, thereby removing the need for PHP to load \
and parse scripts on each request."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-opcache-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "7e53b542114675c7243586b2beb5ed13220d58edf55bcaeacbe5f6a5d79546ff6b002f95fe515f640014b8d2103ba8e2a60393b9ae324dcc20a125d99fabd35a"

RPROVIDES:${PN} += "config-php8-opcache \
php-opcache \
php8-opcache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
