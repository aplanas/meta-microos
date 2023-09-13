SUMMARY = "OpenSSL integration for PHP"
DESCRIPTION = "This extension binds functions of OpenSSL library for symmetric and \
asymmetric encryption and decryption, PBKDF2, PKCS#7, PKCS#12, X.509 \
and other crypto operations. It also provides an implementation of \
TLS streams."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-openssl-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "2e7643dd32d45d4a8e5e186bed7b0a553eb89219772ed3fda02bfad69a669d22c537a9c8d81ae7bc9a7387a2ccdd255254cfd235d2c9719b3e4fcfb4c156a620"

RPROVIDES:${PN} += "config-php8-openssl \
php-openssl \
php8-openssl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm
