SUMMARY = "Streaming-based XML writer extension for PHP"
DESCRIPTION = "XMLWriter wraps the libxml xmlWriter API. Represents a writer that \
provides a non-cached, forward-only means of generating streams or \
files containing XML data."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-xmlwriter-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "63f9ac37b4a3110fa8818566c71175de86df1eaaad2da521b842268b7380df6a4cced6e45bb3195955f2a46a821873e2f4a5a283cfe88f3308b27cfdd28dfa17"

RPROVIDES:${PN} += "config-php8-xmlwriter \
php-xmlwriter \
php8-xmlwriter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm
