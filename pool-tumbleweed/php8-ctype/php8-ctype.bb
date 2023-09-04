SUMMARY = "Character class extension for PHP"
DESCRIPTION = "PHP functions for checking whether a character or string falls into a \
certain character class according to the current locale."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-ctype-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "d29fb2dd9f3a1513759bed86734b830bf5cc9d790696bd2e2adaceb7b541ea9c6b1630750bb092d307ca657e99dfa0467854bc1dfbe813f88d312e3b06832e72"

RPROVIDES:${PN} += "config-php8-ctype \
php-ctype \
php8-ctype"

RDEPENDS:${PN} += "libc.so.6 \
php"

inherit rpm
