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

PV = "8.2.10"

RPM_NAME = "php8-pdo-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "ddaade97ae2f9b5470f0b3471a8b776857b95569b6bd211429dc7653a71d68cf420e9059582208ca5dc371c7400b14bdca1044324703aebd8d2a44737a987373"

RPROVIDES:${PN} += "config-php8-pdo \
php-pdo \
php8-pdo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
