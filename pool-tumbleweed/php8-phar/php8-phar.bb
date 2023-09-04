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

PV = "8.2.9"

RPM_NAME = "php8-phar-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "00ea8c9eb7043ec177b5e5d38299815fd3093d3f4c5a324343023934334ba7323caff3a0c9816329b56a64b569d9a33cd2305fbd92f18b75781f12ec5881280f"

RPROVIDES:${PN} += "config-php8-phar \
php-phar \
php8-phar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-zlib"

inherit rpm
