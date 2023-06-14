SUMMARY = "PHP/MapscriptNG map making extensions to PHP"
DESCRIPTION = "The PHP/Mapscript extension provides full map customization capabilities within the PHP scripting language."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "php-mapscriptng-8.0.0-2.5.aarch64.rpm"
RPM_HASH = "e2797a1f2f6b9053bfcb232e9370e288a15cc6cf942d7e761ad40ac070fd117495ea6db436a05ccb91745b96b320a3d070da62843f94d4dcc683df462866b024"

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
