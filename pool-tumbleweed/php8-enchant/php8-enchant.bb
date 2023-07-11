SUMMARY = "Spell checking extension for PHP"
DESCRIPTION = "Enchant is the PHP binding for the Enchant library. Enchant steps in \
to provide uniformity and conformity on top of all spelling \
libraries, and implements certain features that may be lacking in any \
individual provider library. Everything should 'just work' for any \
and every definition of 'just working.'"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-enchant-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "a8b92cfff555efb275e6a5b903f0ac8295460b5b01af9035b97479285be5bf413547cdac1fdc5d6f4206213d338d6ad99e1ad295c9cde93a7dbe254618034782"

RPROVIDES:${PN} += "config-php8-enchant \
php-enchant \
php8-enchant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
php"

inherit rpm
