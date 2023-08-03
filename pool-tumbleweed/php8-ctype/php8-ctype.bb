SUMMARY = "Character class extension for PHP"
DESCRIPTION = "PHP functions for checking whether a character or string falls into a \
certain character class according to the current locale."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-ctype-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "45de6d7f1b1b1d8584ac70af3d7e93dcf167d7b38fe050c46c06cce1f1dc06ca1ca81cc24a1f562818f7087e222728439345e91d5c5756c1b6dfd07303043c31"

RPROVIDES:${PN} += "config-php8-ctype \
php-ctype \
php8-ctype"

RDEPENDS:${PN} += "libc.so.6 \
php"

inherit rpm
