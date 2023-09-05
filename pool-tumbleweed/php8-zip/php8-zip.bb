SUMMARY = "ZIP archive support for PHP"
DESCRIPTION = "This extension allows to transparently read or write ZIP compressed \
archives and the files inside them."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-zip-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "ed90f58555aecfd3aeb2b7cee04cc84c547316992d0964d4220f04ba00d2b9a7062607569718cbf134d79a90c3dae77f04e802d4b5c3cf1d70317c0355216140"

RPROVIDES:${PN} += "config-php8-zip \
php-zip \
php8-zip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzip.so.5 \
php"

inherit rpm
