SUMMARY = "Character class extension for PHP"
DESCRIPTION = "PHP functions for checking whether a character or string falls into a \
certain character class according to the current locale."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-ctype-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "e7f51fb517daf5ec52cf956cdc679f4f70732b672ebe0ebd7d4fecaef400e02a9abe27113a4bf4db4dba4d428a8348bc222acac9d7e54b98c900d488b942a1ef"

RPROVIDES:${PN} += "config(php8-ctype) \
php-ctype \
php8-ctype \
php8-ctype(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
php"

inherit rpm
