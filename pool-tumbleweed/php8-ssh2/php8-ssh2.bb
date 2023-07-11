SUMMARY = "PHP bindings for the libssh2 library"
DESCRIPTION = "This package provides PHP bindings for the libssh2 library"
LICENSE = "PHP-3.01"

PV = "1.4"

RPM_NAME = "php8-ssh2-1.4-1.3.aarch64.rpm"
RPM_HASH = "8964fa3f002505671bd12b927084c35e268592f8c4e4d48bd34b19c0fc0106d4fb80a99ca2fc27a1d53243c85ff15858115bc48d865722cea5858bcf2dbc253e"

RPROVIDES:${PN} += "config-php8-ssh2 \
php-ssh2 \
php8-ssh2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh2.so.1 \
php-api \
php-zend-abi"

inherit rpm
