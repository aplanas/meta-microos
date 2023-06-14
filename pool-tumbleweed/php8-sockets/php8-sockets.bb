SUMMARY = "Berkeley sockets API for PHP"
DESCRIPTION = "The socket extension implements a low-level interface to the socket \
communication functions based on the BSD sockets API, providing the \
possibility to act as a socket server as well as a client."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-sockets-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "c54db7479cedc58872f96f5a66ff6742e8de1f61ec75c25144615192f2a3ed582df5b92ba928b94e1688106f00945e6fa58f2355767d1ead4edecacab8485171"

RPROVIDES:${PN} += "config-php8-sockets \
php-sockets \
php8-sockets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
