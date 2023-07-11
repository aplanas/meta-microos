SUMMARY = "ZIP archive support for PHP"
DESCRIPTION = "This extension allows to transparently read or write ZIP compressed \
archives and the files inside them."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-zip-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "9ad4bb407aa7d0557fe6b4f408ce4e0fc1c13ded38864581948afc7b722f99b7c68ce39ff349c09ba51b451d7bd38b39be5e34bb605aed9001846502627ec2bc"

RPROVIDES:${PN} += "config-php8-zip \
php-zip \
php8-zip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzip.so.5 \
php"

inherit rpm
