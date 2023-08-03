SUMMARY = "Native language support for PHP"
DESCRIPTION = "PHP functions that implement a Native Language Support (NLS) API which \
can be used to internationalize your PHP applications."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-gettext-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "f4715192a1ee74010fbb27ee6c5ef07806bdd94a6681128d723053120d39910693d803db7eed1bb6862778d51d3f723fbdcc2fa42e79630eb31a1b3b0ef5cbbc"

RPROVIDES:${PN} += "config-php8-gettext \
php-gettext \
php8-gettext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
