SUMMARY = "Berkeley sockets API for PHP"
DESCRIPTION = "The socket extension implements a low-level interface to the socket \
communication functions based on the BSD sockets API, providing the \
possibility to act as a socket server as well as a client."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-sockets-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "afa1dfa55c91bd42eba908ce30d3b00a77374551c9c34c7348209abb402a70b3d7536c561907d5e23f1485077f36f5e20bf4d6c899a5c7410a2c5d1dd86e8b12"

RPROVIDES:${PN} += "config-php8-sockets \
php-sockets \
php8-sockets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
