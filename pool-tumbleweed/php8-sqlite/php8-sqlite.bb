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

PV = "8.2.10"

RPM_NAME = "php8-sqlite-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "59c9e45b5ec3bd815305dc217b4307c2a15384d921a6669cfcecadc6a969beb0a9ff3da788b983cb0409d6989555257794df42c329c67887f41c3ea2ad436757"

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
