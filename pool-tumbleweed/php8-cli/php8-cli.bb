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

PV = "8.2.10"

RPM_NAME = "php8-cli-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "e95d65d04089488eeb57f8675d0472d43f8815e583c08a779cf52bc1652a236a5937cc66276b2a15a8d673c53643d50c9deb825bb529e6c45b7e4af01f6ea507"

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
