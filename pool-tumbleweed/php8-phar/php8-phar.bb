SUMMARY = "PHP Archive extension for PHP"
DESCRIPTION = "The phar extension provides a way to put entire PHP applications into \
a single file called a 'phar' (PHP Archive) for distribution and \
installation. \
 \
In addition, the phar extension also provides a file-format \
abstraction method for creating and manipulating tar and zip files \
through the PharData class, much as PDO provides a unified interface \
for accessing different databases. Phar also can convert between tar, \
zip and phar file formats."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-phar-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "2231dd8591d6b600d988af1602cae042480008cb2565d753606d90c448882289a059b4a1bc08ab871f0b7ab3465d3ffd38114bf70503e627e18478c9d25368b7"

RPROVIDES:${PN} += "config-php8-phar \
php-phar \
php8-phar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-zlib"

inherit rpm
