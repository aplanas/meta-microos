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

PV = "8.2.8"

RPM_NAME = "php8-sqlite-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "2fb802c7d025a9e508c2019f926c3bc776c3b4597863dcfda2877bf50a2d9164ba0f5df206c8f515a7b6ac39dc01269e009524e9db80ad468d2960ac131b3e2f"

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
