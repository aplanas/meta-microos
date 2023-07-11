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

PV = "8.2.7"

RPM_NAME = "php8-pdo-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "973e0dffd03067eb38c4a3cce4ab5c7beb2ffafd1dd233f574e21784c51fe8e292113d33fb9885ad41f17b9ee0c0177f638d90eebf5ff38c21e0dd079110fabe"

RPROVIDES:${PN} += "config-php8-pdo \
php-pdo \
php8-pdo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
