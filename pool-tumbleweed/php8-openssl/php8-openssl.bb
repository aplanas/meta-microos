SUMMARY = "OpenSSL integration for PHP"
DESCRIPTION = "This extension binds functions of OpenSSL library for symmetric and \
asymmetric encryption and decryption, PBKDF2, PKCS#7, PKCS#12, X.509 \
and other crypto operations. It also provides an implementation of \
TLS streams."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-openssl-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "a7a9a1f7bfc16eda7d03dfd6eb5e563bf7c86efa73e631eabdaa289762a04b3931c1508af47b3237a4deed9736ee0d8748f2cda9eeeacb0f605c766cb2904596"

RPROVIDES:${PN} += "config-php8-openssl \
php-openssl \
php8-openssl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm
