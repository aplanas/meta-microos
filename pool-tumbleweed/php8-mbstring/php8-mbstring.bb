SUMMARY = "Multibyte string functions for PHP"
DESCRIPTION = "mbstring provides multibyte specific string functions that help \
dealing with multibyte encodings in PHP. mbstring handles character \
encoding conversion between the possible encoding pairs. mbstring \
handles Unicode-based encodings such as UTF-8 and UCS-2 and many \
single-byte encodings for convenience."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-mbstring-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "e1c4d75e216804a8437deaaef6f3333f0d223ee1abbf7d7a477d9babb8398c2b8d4708015430bd3c387e17329ad2d011ac4398734dcb853dd12996938029ae5e"

RPROVIDES:${PN} += "config-php8-mbstring \
php-mbstring \
php8-mbstring"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libonig.so.5 \
php"

inherit rpm
