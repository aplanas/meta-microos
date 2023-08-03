SUMMARY = "Streaming-based XML writer extension for PHP"
DESCRIPTION = "XMLWriter wraps the libxml xmlWriter API. Represents a writer that \
provides a non-cached, forward-only means of generating streams or \
files containing XML data."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-xmlwriter-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "afae42f2bb31fbfacc935bba7fd11c7671559c80bb70b995980337af1eefca08294699aa2a7bf0a2d448b8be12071d4b3ec7fc72b4ba513bc8544a2600ba457d"

RPROVIDES:${PN} += "config-php8-xmlwriter \
php-xmlwriter \
php8-xmlwriter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm
