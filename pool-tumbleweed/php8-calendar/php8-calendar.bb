SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP functions for converting between different calendar formats."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-calendar-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "748d4801d584398f713e4d606a1202044b4a653f43bac2343ec03c866e56d0f99c2cc3fa0c38218c41352781d87591377419bc12411cffad5ca2af8100429442"

RPROVIDES:${PN} += "config-php8-calendar \
php-calendar \
php8-calendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
