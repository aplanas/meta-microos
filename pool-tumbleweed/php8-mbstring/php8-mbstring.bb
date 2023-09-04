SUMMARY = "Multibyte string functions for PHP"
DESCRIPTION = "mbstring provides multibyte specific string functions that help \
dealing with multibyte encodings in PHP. mbstring handles character \
encoding conversion between the possible encoding pairs. mbstring \
handles Unicode-based encodings such as UTF-8 and UCS-2 and many \
single-byte encodings for convenience."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-mbstring-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "de75feee04b71289dad7fd28d232db23fcf740fc5ca7f929a63bab5c5260d0a460c794aed0a1d77cc782f945317b6dcf520bc623bbf1d9f4c6d60843d58baf58"

RPROVIDES:${PN} += "config-php8-mbstring \
php-mbstring \
php8-mbstring"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libonig.so.5 \
php"

inherit rpm
