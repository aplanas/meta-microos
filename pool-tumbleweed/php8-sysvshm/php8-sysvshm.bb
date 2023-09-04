SUMMARY = "SysV Shared Memory support for PHP"
DESCRIPTION = "PHP interface for System V shared memory."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-sysvshm-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "ff72b3fec4ece81e4d43b9e478d4cb39ebb80c5118960340824d338aa59698989f918d862eb8f0e4e7c339263ddf4c429fabeca7f129b74d181e38225a98cd21"

RPROVIDES:${PN} += "config-php8-sysvshm \
php-sysvshm \
php8-sysvshm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
