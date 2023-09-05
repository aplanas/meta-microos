SUMMARY = "Spell checking extension for PHP"
DESCRIPTION = "Enchant is the PHP binding for the Enchant library. Enchant steps in \
to provide uniformity and conformity on top of all spelling \
libraries, and implements certain features that may be lacking in any \
individual provider library. Everything should 'just work' for any \
and every definition of 'just working.'"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-enchant-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "878fb6b5e5bc9eb266ebd0d965fa1ce197d09e9ea1a39904801fb951dc8045925638d07c5d6ed0bb54c8d29d3b58016df09d1c11d740ab6c79afd62037b0d8af"

RPROVIDES:${PN} += "config-php8-enchant \
php-enchant \
php8-enchant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
php"

inherit rpm
