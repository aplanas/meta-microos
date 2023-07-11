SUMMARY = "'Binary Calculator' extension for PHP"
DESCRIPTION = "Binary Calculator which supports numbers of any size and precision, \
represented as strings."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-bcmath-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "7688bdf969e6daa6dfdc722c26d0b6a5fae47a1c9c3b1252254b0bf3d09f54f9fd7ef506666f99b81b2b9a53ce1560eab302483b3cb5a56bce8ba5573f422f45"

RPROVIDES:${PN} += "config-php8-bcmath \
php-bcmath \
php8-bcmath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
