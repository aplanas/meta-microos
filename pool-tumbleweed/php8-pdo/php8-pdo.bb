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

PV = "8.2.8"

RPM_NAME = "php8-pdo-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "87eb1ff4ef391a853e1519fb30f55c5eee1041cd80dff381876ccaea8d46374033fae8c722ae2b8d4cbbf7f0a275d5e078d065ae41365da5cf0d1d93d8034066"

RPROVIDES:${PN} += "config-php8-pdo \
php-pdo \
php8-pdo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
