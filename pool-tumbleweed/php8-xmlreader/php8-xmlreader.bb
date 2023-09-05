SUMMARY = "Streaming XML reader extension for PHP"
DESCRIPTION = "The XMLReader extension is an XML Pull parser. The reader acts as a \
cursor going forward on the document stream and stopping at each node \
on the way."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-xmlreader-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "b80b1dba7471b99f8c5fc7cac3a714c154821fa389ec62069a78540e9f707ea8813fac1f760d4e6bc52a0fb60d2d8e4def6294f30482d46ae7a2cafd5af37e57"

RPROVIDES:${PN} += "config-php8-xmlreader \
php-xmlreader \
php8-xmlreader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php \
php-dom"

inherit rpm
