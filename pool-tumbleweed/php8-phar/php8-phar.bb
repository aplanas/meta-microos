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

PV = "8.2.8"

RPM_NAME = "php8-phar-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "fdee7b45c19f50df656e349d6edab815873ce6e1ae2ad5eaacc7e2e04eca6ad76f1a1a5911e7a1310cae6405194c69bad0f3085d576843f0e9263a0adb67c2ec"

RPROVIDES:${PN} += "config-php8-phar \
php-phar \
php8-phar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-zlib"

inherit rpm
