SUMMARY = "Spell checking extension for PHP"
DESCRIPTION = "Enchant is the PHP binding for the Enchant library. Enchant steps in \
to provide uniformity and conformity on top of all spelling \
libraries, and implements certain features that may be lacking in any \
individual provider library. Everything should 'just work' for any \
and every definition of 'just working.'"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-enchant-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "8f0ed291cce07156a81489cad934f1cff65c643105aef757e4855946435a75d32b2bf14fd635d7c4e936a59cd780d4ba192a45e6c6063729609975e3830634a6"

RPROVIDES:${PN} += "config-php8-enchant \
php-enchant \
php8-enchant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
php"

inherit rpm
