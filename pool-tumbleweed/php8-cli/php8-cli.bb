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

PV = "8.2.8"

RPM_NAME = "php8-cli-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "0061cca9a34a668c179c49d4e5cd7dccfcc860a37858ba962f70e000272d8b47de52450a2c197c2cc1ed218fbe5a881786dd813a47862c82cbea7b23640cfbff"

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
