SUMMARY = "Streaming-based XML writer extension for PHP"
DESCRIPTION = "XMLWriter wraps the libxml xmlWriter API. Represents a writer that \
provides a non-cached, forward-only means of generating streams or \
files containing XML data."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-xmlwriter-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "dbc9a40e8e72ada74887ba70e6cdba94faed20f29846863247465d24acbcdd8886a65de748d4b13114afbac1447994c1436b10737e8a7b16baeed0ccb6719867"

RPROVIDES:${PN} += "config-php8-xmlwriter \
php-xmlwriter \
php8-xmlwriter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm
