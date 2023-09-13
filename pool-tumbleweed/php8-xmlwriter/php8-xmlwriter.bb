SUMMARY = "Streaming-based XML writer extension for PHP"
DESCRIPTION = "XMLWriter wraps the libxml xmlWriter API. Represents a writer that \
provides a non-cached, forward-only means of generating streams or \
files containing XML data."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-xmlwriter-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "f02ca2cee8636c5ab50d0a96c3361a2288f8417f4617ef9752e1f139337ed9aae916524bf774189cf3f653d055675618ef9a338081341f0b4336ec21cae859aa"

RPROVIDES:${PN} += "config-php8-xmlwriter \
php-xmlwriter \
php8-xmlwriter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm
