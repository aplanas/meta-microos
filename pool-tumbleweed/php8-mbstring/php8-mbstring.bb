SUMMARY = "Multibyte string functions for PHP"
DESCRIPTION = "mbstring provides multibyte specific string functions that help \
dealing with multibyte encodings in PHP. mbstring handles character \
encoding conversion between the possible encoding pairs. mbstring \
handles Unicode-based encodings such as UTF-8 and UCS-2 and many \
single-byte encodings for convenience."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-mbstring-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "c5e758b69791ea908bf4bd8e891a0e3dcdcea6da0ab79a382a320d9a5284a8625e2cf8241e797e193b3eda9475cbe8470628ed8e08ef7620a89e22728dd19612"

RPROVIDES:${PN} += "config-php8-mbstring \
php-mbstring \
php8-mbstring"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libonig.so.5 \
php"

inherit rpm
