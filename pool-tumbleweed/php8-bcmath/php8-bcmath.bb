SUMMARY = "'Binary Calculator' extension for PHP"
DESCRIPTION = "Binary Calculator which supports numbers of any size and precision, \
represented as strings."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-bcmath-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "5fc762b8a3730aaf3effb38fbbca642b31bff69956b4b958408fac8e3e65aec3cd1d145dc312c6bf4f5ee604319d77bbaf0d0af8ea81b5debff55e74e7804438"

RPROVIDES:${PN} += "config-php8-bcmath \
php-bcmath \
php8-bcmath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
