SUMMARY = "OpenSSL integration for PHP"
DESCRIPTION = "This extension binds functions of OpenSSL library for symmetric and \
asymmetric encryption and decryption, PBKDF2, PKCS#7, PKCS#12, X.509 \
and other crypto operations. It also provides an implementation of \
TLS streams."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-openssl-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "85c820f9eefd7bd5c635b8f35d031f8ffc74c7e5707fb1a9cb0d27f32b18093cd1144cba1486937867dcdcf789fefc87174bd2e62287695a9f629e5bf682b663"

RPROVIDES:${PN} += "config-php8-openssl \
php-openssl \
php8-openssl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm
