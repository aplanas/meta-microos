SUMMARY = "Document Object Model extension for PHP"
DESCRIPTION = "This module adds Document Object Model (DOM) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-dom-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "8f9b62490950abee8e663b9128d8d4962c9fc283a11da373989f72a1ea749319783603fde3716bdf90479a12a9e9d95f066a1ad09c052bfa72cc3e21d0bdc3ae"

RPROVIDES:${PN} += "config-php8-dom \
php-dom \
php8-dom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm
