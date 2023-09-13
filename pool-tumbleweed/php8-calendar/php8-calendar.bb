SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP functions for converting between different calendar formats."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-calendar-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "e71df2baff369f660dfb137ca6c523e91a581e9c408a66e5e822dbb9eda1bd6e167510ab6b8e96b43603cee9b9be0a831c78abe05ed1ace6007a91d2b0c59532"

RPROVIDES:${PN} += "config-php8-calendar \
php-calendar \
php8-calendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
