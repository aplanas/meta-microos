SUMMARY = "Streaming-based XML writer extension for PHP"
DESCRIPTION = "XMLWriter wraps the libxml xmlWriter API. Represents a writer that \
provides a non-cached, forward-only means of generating streams or \
files containing XML data."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-xmlwriter-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "ae3dc5c1742053358a62bb69f797fe247ed8b6285c07322f56e66c9754b8b8856571be1104a1c680037d7529ee12c44faf286fbcbe642919de680c4050904e6c"

RPROVIDES:${PN} += "config-php8-xmlwriter \
php-xmlwriter \
php8-xmlwriter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm
