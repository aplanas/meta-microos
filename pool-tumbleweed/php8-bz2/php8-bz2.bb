SUMMARY = "PHP bzip2 codec support"
DESCRIPTION = "PHP functions to read and write bzip2 (.bz2) compressed files."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-bz2-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "e2859ccf9bb03cea8a2865fc986209bfb2036c86a1386230cabe4a709d9ed7f0edfa0f2ae727207e603dd45059e21fc4a888e6f6b658c90d9b0ea21ee4e49a0c"

RPROVIDES:${PN} += "config-php8-bz2 \
php-bz2 \
php8-bz2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
php"

inherit rpm
