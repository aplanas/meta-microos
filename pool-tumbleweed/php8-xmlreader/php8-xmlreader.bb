SUMMARY = "Streaming XML reader extension for PHP"
DESCRIPTION = "The XMLReader extension is an XML Pull parser. The reader acts as a \
cursor going forward on the document stream and stopping at each node \
on the way."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-xmlreader-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "242efbc95b76beb4e51366b9a56773a814d33bbc9e8cca75fbd2d36ba61e875f4230837d00e1b560f63f035d92cc1edd5a92dc59a055f5f8fb7028b7c48d81d3"

RPROVIDES:${PN} += "config-php8-xmlreader \
php-xmlreader \
php8-xmlreader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php \
php-dom"

inherit rpm
