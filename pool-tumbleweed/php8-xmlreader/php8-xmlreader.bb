SUMMARY = "Streaming XML reader extension for PHP"
DESCRIPTION = "The XMLReader extension is an XML Pull parser. The reader acts as a \
cursor going forward on the document stream and stopping at each node \
on the way."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-xmlreader-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "deafb939d687e89e758c2dff983b11564005837a484eb1a174e0a295b072c61ad29f5dd90edad5b5f5c37cf941f39f222c1beede673b8da5b22f77a94a56bcbd"

RPROVIDES:${PN} += "config-php8-xmlreader \
php-xmlreader \
php8-xmlreader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php \
php-dom"

inherit rpm
