SUMMARY = "'Binary Calculator' extension for PHP"
DESCRIPTION = "Binary Calculator which supports numbers of any size and precision, \
represented as strings."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-bcmath-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "7ee973e51497c29694152e907e9e809b8115bb3b5998f85675ffa895c1486c5ace92a9589fee7524234ff8fd469d1f8d1b1bc849ef61bdfa0fc4e08ef4978688"

RPROVIDES:${PN} += "config-php8-bcmath \
php-bcmath \
php8-bcmath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
