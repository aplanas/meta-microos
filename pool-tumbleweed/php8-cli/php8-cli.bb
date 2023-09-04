SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the standard implementation of PHP, namely Zend \
PHP. Included are the PHP command-line binary and the configuration \
file (php.ini). \
 \
Additional documentation is available in package php-doc."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-cli-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "c3ddb142e521ff70d9b79d45dc4ab893be52ef3dfcbb1cdfe0766ebee615ad201ba188b97fae35f85300f01766440f1ff3ce110b45580499798244239ffa7ea0"

RPROVIDES:${PN} += "config-php8-cli \
php-cli \
php-sapi \
php8-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libxml2.so.2 \
php"

inherit rpm
