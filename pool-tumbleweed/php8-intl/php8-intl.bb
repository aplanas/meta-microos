SUMMARY = "ICU integration for PHP"
DESCRIPTION = "The internationalization (intl) extension is a wrapper for the ICU \
library, enabling PHP programmers to perform UCA (Unicode Collation \
Algorithm) conformant collation as well as date, time, number and \
currency formatting in their scripts."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-intl-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "2d41e1576e97a6b66515d4dc0ed8f95a883e5331d4ca82eac7184b98ae9d6102c05c3dad590f5d33a9a917fee1ff244979180e3c406d8e0afbc4b6972d28d52f"

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
