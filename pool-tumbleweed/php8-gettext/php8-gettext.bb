SUMMARY = "Native language support for PHP"
DESCRIPTION = "PHP functions that implement a Native Language Support (NLS) API which \
can be used to internationalize your PHP applications."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-gettext-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "873eab474c713710f3c2c3ce8672857baa08f06b5042f0620209e01fe46c9587855e89bf2f59703b52af0e70469910ee885b05440e30215107e7c9289473fca5"

RPROVIDES:${PN} += "config-php8-gettext \
php-gettext \
php8-gettext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
