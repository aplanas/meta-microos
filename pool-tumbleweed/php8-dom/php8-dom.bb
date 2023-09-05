SUMMARY = "Document Object Model extension for PHP"
DESCRIPTION = "This module adds Document Object Model (DOM) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-dom-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "88e1f4c9c38f2d78f85151668ead5776555d1686fe9a70bcfba11960b24de1a57d92290f2b72f205314a089b5d9810ef0bef005171009e075c600e53298550e3"

RPROVIDES:${PN} += "config-php8-dom \
php-dom \
php8-dom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm
