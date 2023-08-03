SUMMARY = "'Binary Calculator' extension for PHP"
DESCRIPTION = "Binary Calculator which supports numbers of any size and precision, \
represented as strings."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-bcmath-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "d635fd1c6774aefac29093965a306cdbbd199d20d74569e52ac4fdb4c7b152f3f1f2a8083e27969515e85d9202f3550dd9d459c5c0c90336cb9bd82ea2de366c"

RPROVIDES:${PN} += "config-php8-bcmath \
php-bcmath \
php8-bcmath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
