SUMMARY = "Multibyte string functions for PHP"
DESCRIPTION = "mbstring provides multibyte specific string functions that help \
dealing with multibyte encodings in PHP. mbstring handles character \
encoding conversion between the possible encoding pairs. mbstring \
handles Unicode-based encodings such as UTF-8 and UCS-2 and many \
single-byte encodings for convenience."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-mbstring-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "82f2743a44a8965d282aca29ff1ff1fd6cc33114d4865647486ab82d1d78b6089cea4d0465746968dfee69ed7817b68910a88a3f30b1fd37de584a16164e3571"

RPROVIDES:${PN} += "config-php8-mbstring \
php-mbstring \
php8-mbstring"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libonig.so.5 \
php"

inherit rpm
