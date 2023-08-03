SUMMARY = "Document Object Model extension for PHP"
DESCRIPTION = "This module adds Document Object Model (DOM) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-dom-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "079313d3e8b043db98ce48fea182472f29b0401145eec7ad93fa5a563c0f948139f89b9942a16ae194795e2483d6819e2b0db757c6be025ac489395f9c9b7b25"

RPROVIDES:${PN} += "config-php8-dom \
php-dom \
php8-dom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm
