SUMMARY = "OpenSSL integration for PHP"
DESCRIPTION = "This extension binds functions of OpenSSL library for symmetric and \
asymmetric encryption and decryption, PBKDF2, PKCS#7, PKCS#12, X.509 \
and other crypto operations. It also provides an implementation of \
TLS streams."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-openssl-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "ffd63b8012b78fd89ca950c4630614983c1134489ead9debfcc375f7f99cc19f76db3ff1fa4553c0a81f182e827e44f3ebcf2ddcb1e472723c927a74063e607e"

RPROVIDES:${PN} += "config(php8-openssl) \
php-openssl \
php8-openssl \
php8-openssl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
php"

inherit rpm
