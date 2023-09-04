SUMMARY = "Native language support for PHP"
DESCRIPTION = "PHP functions that implement a Native Language Support (NLS) API which \
can be used to internationalize your PHP applications."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-gettext-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "f154c0ff4f88c0b59cfdacb64dd5225243bd1d6a957d7c7e2bd991c1974ade6beafa538a83e9aeebf69ace2468dc0fc93fa52f5c8621d41aad247724677ea13b"

RPROVIDES:${PN} += "config-php8-gettext \
php-gettext \
php8-gettext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
