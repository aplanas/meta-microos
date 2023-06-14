SUMMARY = "PHP bindings for the libssh2 library"
DESCRIPTION = "This package provides PHP bindings for the libssh2 library"
LICENSE = "PHP-3.01"

PV = "1.4"

RPM_NAME = "php8-ssh2-1.4-1.2.aarch64.rpm"
RPM_HASH = "a2545e04e98a648e2706a22d62bbb93e17085c6ac05da7e6bfba7c760cd17bb347f3b4e01c9c35640a4566fc269877da27a20f7ef445a4436e82b24e47eec3e9"

RPROVIDES:${PN} += "config-php8-ssh2 \
php-ssh2 \
php8-ssh2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh2.so.1 \
php-api \
php-zend-abi"

inherit rpm
