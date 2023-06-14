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

PV = "8.1.19"

RPM_NAME = "php8-phar-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "25198fabbb2e60539e59ed6b06a5a39466b3b87f469547a797b17c69d3783247948f80e9785add2249e5defe0422bcb4153adcc0856a32198ce55d12785b74d6"

RPROVIDES:${PN} += "config-php8-phar \
php-phar \
php8-phar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-zlib"

inherit rpm
