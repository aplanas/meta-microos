SUMMARY = "Spell checking extension for PHP"
DESCRIPTION = "Enchant is the PHP binding for the Enchant library. Enchant steps in \
to provide uniformity and conformity on top of all spelling \
libraries, and implements certain features that may be lacking in any \
individual provider library. Everything should 'just work' for any \
and every definition of 'just working.'"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-enchant-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "4c805bb5194a3d4ad5ffd6de976c792f62e5f392ac334c25ab50f2ebacb213da406d284261226424d0a1b998c81af1862e2d1f4b9eda607331e99d36c90dbce1"

RPROVIDES:${PN} += "config-php8-enchant \
php-enchant \
php8-enchant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
php"

inherit rpm
