SUMMARY = "Document Object Model extension for PHP"
DESCRIPTION = "This module adds Document Object Model (DOM) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-dom-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "ebdd430277207cf2acb4d7a17884c8827049ce62ca4d052121596fd7fe6913ed76d0ec6d25ca5860df573497d506e1b3a7e8379b436add2d8099338b6b0e18af"

RPROVIDES:${PN} += "config-php8-dom \
php-dom \
php8-dom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm
