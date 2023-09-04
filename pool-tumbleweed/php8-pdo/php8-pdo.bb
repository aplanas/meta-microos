SUMMARY = "PHP Data Objects extension for PHP"
DESCRIPTION = "The PHP Data Objects (PDO) extension defines an interface for \
accessing databases in PHP. Each database driver that implements the \
PDO interface can expose database-specific features as regular \
extension functions. Note that you use a database-specific PDO driver \
to access a database server. \
 \
PDO provides a data-access abstraction layer, which means that, \
regardless of the database used, you use the same functions to issue \
queries and fetch data. PDO does not provide a database abstraction; \
it does not rewrite SQL or emulate missing features."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-pdo-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "0870cf166b8bc34436d7c6d9176d551481c097a9b19bc58c22e3dd3a8219f3d334db121df07e764a3279bb728bcf0d514506b37f8a214a27d4cacd9383bebfb0"

RPROVIDES:${PN} += "config-php8-pdo \
php-pdo \
php8-pdo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
