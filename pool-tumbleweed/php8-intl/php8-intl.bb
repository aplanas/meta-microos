SUMMARY = "ICU integration for PHP"
DESCRIPTION = "The internationalization (intl) extension is a wrapper for the ICU \
library, enabling PHP programmers to perform UCA (Unicode Collation \
Algorithm) conformant collation as well as date, time, number and \
currency formatting in their scripts."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-intl-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "5b7948ef68c9c04f3c1b9fbe7a41e97a2c2ac7d4a2c5f11c1c8a48ba6776413b04c9d025fbbfd4ebcd55c1ef0e0cf855d1b80339481f2215ab3ad081f355cc3b"

RPROVIDES:${PN} += "config-php8-intl \
php-intl \
php8-intl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuio.so.73 \
libicuuc.so.73 \
php"

inherit rpm
