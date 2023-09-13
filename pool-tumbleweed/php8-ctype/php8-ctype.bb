SUMMARY = "Character class extension for PHP"
DESCRIPTION = "PHP functions for checking whether a character or string falls into a \
certain character class according to the current locale."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-ctype-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "133cf3d033083243610d0a7c9a55c7c99936d2a6e18aeb4f1cc19511eada28ad704a5ba0c9144e7ba66901df4523972396247af70b5ae3172d788ca9b2256cec"

RPROVIDES:${PN} += "config-php8-ctype \
php-ctype \
php8-ctype"

RDEPENDS:${PN} += "libc.so.6 \
php"

inherit rpm
