SUMMARY = "PHP/MapscriptNG map making extensions to PHP"
DESCRIPTION = "The PHP/Mapscript extension provides full map customization capabilities within the PHP scripting language."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "php-mapscriptng-8.0.0-2.7.aarch64.rpm"
RPM_HASH = "b39063b69b98037357a1b2055adece7291f8d499b04bbc8b0603b669ecadd38c00ebfdd54f6e4f8eae2ec86553e7e4d8bb7d0f5ce7b413771af0024eaa4b208d"

RPROVIDES:${PN} += "config-php-mapscriptng \
php-mapscriptng \
php-mapserver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmapserver.so.2 \
libmapserver2 \
php \
php-gd"

inherit rpm
