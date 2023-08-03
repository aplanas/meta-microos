SUMMARY = "Streaming XML reader extension for PHP"
DESCRIPTION = "The XMLReader extension is an XML Pull parser. The reader acts as a \
cursor going forward on the document stream and stopping at each node \
on the way."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-xmlreader-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "2de6a3bc4ae5e4f3e6018c5737875aa03916e514838d1634f9354adfa15f223a284bd4d669dcbe82f529af734dcb787a0d117e425e6168f9d46b0e4ece8ea6d9"

RPROVIDES:${PN} += "config-php8-xmlreader \
php-xmlreader \
php8-xmlreader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php \
php-dom"

inherit rpm
