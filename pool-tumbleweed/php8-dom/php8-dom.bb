SUMMARY = "Document Object Model extension for PHP"
DESCRIPTION = "This module adds Document Object Model (DOM) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-dom-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "01480a2d3c855fb7a31561ad2e593ef66361445084c36b853188086f36755950d7999b9ff81006ba71594783f673ccf747a8fdc37fa0c47f1b5fb1a413c425b9"

RPROVIDES:${PN} += "config-php8-dom \
php-dom \
php8-dom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm
