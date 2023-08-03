SUMMARY = "OpenSSL integration for PHP"
DESCRIPTION = "This extension binds functions of OpenSSL library for symmetric and \
asymmetric encryption and decryption, PBKDF2, PKCS#7, PKCS#12, X.509 \
and other crypto operations. It also provides an implementation of \
TLS streams."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-openssl-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "1402cfae6e4f2708189a1ea0d37422e2e64f0767b9b880ad2786c6b6477b7298df61f18d3b6a25549c110c3e9f729ac1e42030d725ff6dcca0cd07097018bb1c"

RPROVIDES:${PN} += "config-php8-openssl \
php-openssl \
php8-openssl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm
