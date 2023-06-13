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

PV = "8.1.19"

RPM_NAME = "php8-pdo-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "e0a63f448e9de1c1b34331ec643ab2c729de08fcfbd438d166050d9b8d78ae727106bcd6b4308720eb86bac32935ce55caef22b88bbbac4f3ff5013a4f33db17"

RPROVIDES:${PN} += "config(php8-pdo) \
php-pdo \
php8-pdo \
php8-pdo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
php"

inherit rpm
