SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP functions for converting between different calendar formats."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-calendar-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "f87b4fa3de6a4b32d09e4e23930bade238810793d14164a4ba0decdccd8ae521594a047092000fb3748d5db08a04688e7c9993c920ebc84d46530c3494491363"

RPROVIDES:${PN} += "config-php8-calendar \
php-calendar \
php8-calendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
