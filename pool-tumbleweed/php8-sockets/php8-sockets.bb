SUMMARY = "Berkeley sockets API for PHP"
DESCRIPTION = "The socket extension implements a low-level interface to the socket \
communication functions based on the BSD sockets API, providing the \
possibility to act as a socket server as well as a client."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-sockets-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "60f601842bd92630465792153571a12ebd4aa69a7d2dd3a1e44ead712f1a93d8556755645718dbc0a256109e0f0432f637e1ad1ac5d3a37bed6ead90ee8d3b5e"

RPROVIDES:${PN} += "config-php8-sockets \
php-sockets \
php8-sockets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
