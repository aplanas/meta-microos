SUMMARY = "ICU integration for PHP"
DESCRIPTION = "The internationalization (intl) extension is a wrapper for the ICU \
library, enabling PHP programmers to perform UCA (Unicode Collation \
Algorithm) conformant collation as well as date, time, number and \
currency formatting in their scripts."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-intl-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "472fa99e6a2ef18a0fa6119188d69e7a27eaa2bb1b9a70e1e368f28a6097630eee527c8e2ca48c0ce06c79f4b93a8428d27b263536ef7afcc459c708a0b6867e"

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
