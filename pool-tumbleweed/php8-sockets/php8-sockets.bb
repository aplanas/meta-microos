SUMMARY = "Berkeley sockets API for PHP"
DESCRIPTION = "The socket extension implements a low-level interface to the socket \
communication functions based on the BSD sockets API, providing the \
possibility to act as a socket server as well as a client."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-sockets-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "06577029e4d5dfaed0d5032ba1d2897c23efaf63a85752cf2da4073dc177fd88241f2753dbbb718a2347e8c95335f14221d162afe4155a9dcf65ff736d9f1221"

RPROVIDES:${PN} += "config-php8-sockets \
php-sockets \
php8-sockets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
