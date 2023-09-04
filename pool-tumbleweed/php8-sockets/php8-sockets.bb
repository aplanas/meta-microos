SUMMARY = "Berkeley sockets API for PHP"
DESCRIPTION = "The socket extension implements a low-level interface to the socket \
communication functions based on the BSD sockets API, providing the \
possibility to act as a socket server as well as a client."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-sockets-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "d84767e59a0833c743c0a35451dd17e85e10790e95c5ae451661ac1bddc51f2c7ce55a140f6f684bcbf543bd0a46db2b4064dbf175685bb71befba1535b69fe9"

RPROVIDES:${PN} += "config-php8-sockets \
php-sockets \
php8-sockets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
