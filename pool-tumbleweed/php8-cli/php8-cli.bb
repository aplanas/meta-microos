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

PV = "8.2.7"

RPM_NAME = "php8-cli-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "b17231e236de41c3a33c0a67c793705661441dd5d37e910941d83690451a1f8f75c93f57551d7129f12d743ae168814141a154a5bbc91ea7dcb4dd4ad041c1db"

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
