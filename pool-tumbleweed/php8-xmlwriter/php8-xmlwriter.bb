SUMMARY = "Streaming-based XML writer extension for PHP"
DESCRIPTION = "XMLWriter wraps the libxml xmlWriter API. Represents a writer that \
provides a non-cached, forward-only means of generating streams or \
files containing XML data."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-xmlwriter-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "c05bc9f048bc305b2245aeee496145b43b3cf064951ff51260ad3b61267bc67b95374395bf6805891b53e05e7a13693459909f9e3adfd014e316ab12b621277f"

RPROVIDES:${PN} += "config-php8-xmlwriter \
php-xmlwriter \
php8-xmlwriter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm
