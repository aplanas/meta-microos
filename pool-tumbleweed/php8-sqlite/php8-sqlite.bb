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

PV = "8.1.19"

RPM_NAME = "php8-sqlite-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "1cb37ad9dd0c3492d711e283a744d423a62ce442be1d5409ef9d21b376ee64e6b6654665f65704095151f9e5ef186d3d4a17250d3c7791ac0dddacb6e9004cc6"

RPROVIDES:${PN} += "config(php8-sqlite) \
php-pdo_sqlite \
php-sqlite \
php8-sqlite \
php8-sqlite(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsqlite3.so.0()(64bit) \
php \
php-pdo"

inherit rpm
