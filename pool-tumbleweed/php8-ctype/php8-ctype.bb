SUMMARY = "Character class extension for PHP"
DESCRIPTION = "PHP functions for checking whether a character or string falls into a \
certain character class according to the current locale."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-ctype-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "115b36d21d250e349e5e961ddcc18e176d839d506ebfea93107d5787236527c0d113dce7973f5710f9c8b084012a1ea49e9c92e58df786dec85265520618b4f1"

RPROVIDES:${PN} += "config-php8-ctype \
php-ctype \
php8-ctype"

RDEPENDS:${PN} += "libc.so.6 \
php"

inherit rpm
