SUMMARY = "Cryptographic Extension Based on Libsodium"
DESCRIPTION = "PHP binding to libsodium software library for encryption, decryption, \
signatures, password hashing and more."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-sodium-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "b3eef59cd3d7e7bf90dd14182ae2dedd90c28b3f758342c5e199b75421474377b338af26841ec48995dfe61370a8663d1e2eccf6fc0e9e5d65a3edc90c9fad8f"

RPROVIDES:${PN} += "config-php8-sodium \
php-sodium \
php8-sodium"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23 \
php"

inherit rpm
