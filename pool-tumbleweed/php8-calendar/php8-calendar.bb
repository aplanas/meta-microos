SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP functions for converting between different calendar formats."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-calendar-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "d259a3f59b12e2a465f9c995264bf02448864ef370df8928e4b1455b2287295842913b03dbfdb9f721788fd4831d43a1cae4c8f993ffdeb6eb228933819deaf9"

RPROVIDES:${PN} += "config-php8-calendar \
php-calendar \
php8-calendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
