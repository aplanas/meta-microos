SUMMARY = "Spell checking extension for PHP"
DESCRIPTION = "Enchant is the PHP binding for the Enchant library. Enchant steps in \
to provide uniformity and conformity on top of all spelling \
libraries, and implements certain features that may be lacking in any \
individual provider library. Everything should 'just work' for any \
and every definition of 'just working.'"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-enchant-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "5b7d3a8c0977da632a0ab0d0c387b72689cfc0c102fd60e0e71c0a9fb7f47492306de3f12f8212a1ac41e801b45f990dd48a2be5b195d2d286563a1c21d7d69d"

RPROVIDES:${PN} += "config-php8-enchant \
php-enchant \
php8-enchant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
php"

inherit rpm
