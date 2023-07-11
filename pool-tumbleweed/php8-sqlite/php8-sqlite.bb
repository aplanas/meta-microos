SUMMARY = "SQLite database client for PHP"
DESCRIPTION = "This is an extension for the SQLite Embeddable SQL Database Engine. \
https://www.sqlite.org \
 \
SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process. \
 \
SQLite is not a client library used to connect to a big database \
server. SQLite is the server. The SQLite library reads and writes \
directly to and from the database files on disk. \
 \
This package includes sqlite and pdo_sqlite modules for sqlite version \
2 and 3 respectively."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-sqlite-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "81a9e8fc59d686e3f89c218def23abc4c057f8493dde98e71070e6bc331814307a6ec5303ad623683489ceb2103b825208f44f0ebece95e421d046abf08199ae"

RPROVIDES:${PN} += "config-php8-sqlite \
php-pdo-sqlite \
php-sqlite \
php8-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
php \
php-pdo"

inherit rpm
