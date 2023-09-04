SUMMARY = "Streaming XML reader extension for PHP"
DESCRIPTION = "The XMLReader extension is an XML Pull parser. The reader acts as a \
cursor going forward on the document stream and stopping at each node \
on the way."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-xmlreader-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "bd564d8cf26255997e842ef2b1361e2fce7cff1f8bcf6d187b23936b1f22d21c153243d9c0bdc20b57b29f5ebfcfeed03e934e945f44ce3df60702779a5aadcb"

RPROVIDES:${PN} += "config-php8-xmlreader \
php-xmlreader \
php8-xmlreader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php \
php-dom"

inherit rpm
