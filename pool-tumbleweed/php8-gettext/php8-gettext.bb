SUMMARY = "Native language support for PHP"
DESCRIPTION = "PHP functions that implement a Native Language Support (NLS) API which \
can be used to internationalize your PHP applications."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-gettext-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "23b323ffd9cd385cb724e8bcfeee7aa9c5dce8378830644117ebe4266ee0b33a0ed8b1af94743733daea460ca174751a9bf34529890e1b1e06552778c7ac95f6"

RPROVIDES:${PN} += "config-php8-gettext \
php-gettext \
php8-gettext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
