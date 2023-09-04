SUMMARY = "ICU integration for PHP"
DESCRIPTION = "The internationalization (intl) extension is a wrapper for the ICU \
library, enabling PHP programmers to perform UCA (Unicode Collation \
Algorithm) conformant collation as well as date, time, number and \
currency formatting in their scripts."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-intl-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "3ae116f068106fbc7396c2816229430f68b4857a539ba9565be5775765ed1abf66b2b6cf5ffc0aa213735e718a9d267edda7c3f26b4f8b47e489243e6049b1e5"

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
