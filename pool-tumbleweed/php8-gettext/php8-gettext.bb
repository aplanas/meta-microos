SUMMARY = "Native language support for PHP"
DESCRIPTION = "PHP functions that implement a Native Language Support (NLS) API which \
can be used to internationalize your PHP applications."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-gettext-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "586c406117594a4855de997291fae5f58c710ca4396ff195f95b5bc025d57dbfcf6690ff871915aef391a2e796dcd47e43c8b2a426b316c7d7aeff24973d15b0"

RPROVIDES:${PN} += "config-php8-gettext \
php-gettext \
php8-gettext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
