SUMMARY = "Cryptographic Extension Based on Libsodium"
DESCRIPTION = "PHP binding to libsodium software library for encryption, decryption, \
signatures, password hashing and more."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-sodium-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "ba078bd727546fdc6e930709d9fa75245ee600a7460f42279da7bbbc964158b560c65c645804b6b083260cc898e8487c5f03833a4d4a29f925a22412e6616294"

RPROVIDES:${PN} += "config-php8-sodium \
php-sodium \
php8-sodium"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23 \
php"

inherit rpm
