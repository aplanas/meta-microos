SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP functions for converting between different calendar formats."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-calendar-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "9df5e1437df825dab72267dae7ad0d74bcad556c9c24753e0938e59468d4decf97a622698e1d026d4563e460e7367da96c6f07af322e12615accd7250581530c"

RPROVIDES:${PN} += "config-php8-calendar \
php-calendar \
php8-calendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
