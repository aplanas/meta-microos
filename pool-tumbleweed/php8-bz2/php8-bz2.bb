SUMMARY = "PHP bzip2 codec support"
DESCRIPTION = "PHP functions to read and write bzip2 (.bz2) compressed files."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-bz2-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "b4d59c0c69f088898723a5fe9c04cf20a5f2a0199e9ac53af0e4ef9c4db99862d1817dc9ca1119a97b2edba1d194f35911c96554f59db7d6b2ba25a6f940db57"

RPROVIDES:${PN} += "config-php8-bz2 \
php-bz2 \
php8-bz2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
php"

inherit rpm
