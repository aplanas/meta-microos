SUMMARY = "Character class extension for PHP"
DESCRIPTION = "PHP functions for checking whether a character or string falls into a \
certain character class according to the current locale."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-ctype-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "25f3af130901ce2af9e4313dbd7d2b29df03481b87984f82d319cea0f11b62bf8ce300c237031446d9ba6ee365b5556e790f70ff7c3529b41faf9184db694d0d"

RPROVIDES:${PN} += "config-php8-ctype \
php-ctype \
php8-ctype"

RDEPENDS:${PN} += "libc.so.6 \
php"

inherit rpm
