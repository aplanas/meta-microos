SUMMARY = "Berkeley sockets API for PHP"
DESCRIPTION = "The socket extension implements a low-level interface to the socket \
communication functions based on the BSD sockets API, providing the \
possibility to act as a socket server as well as a client."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-sockets-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "d72cb49a7bf116edc274ce4ad34ed74df07d58a03b729ae3ea3345b3f7a6d0812494a4f94a2f1a1f891155c1a972f62d5dca71e9f8035b66c91e53e4715c64e8"

RPROVIDES:${PN} += "config-php8-sockets \
php-sockets \
php8-sockets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
