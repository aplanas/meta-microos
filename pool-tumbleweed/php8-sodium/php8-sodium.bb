SUMMARY = "Cryptographic Extension Based on Libsodium"
DESCRIPTION = "PHP binding to libsodium software library for encryption, decryption, \
signatures, password hashing and more."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-sodium-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "1a0af5bcf5fa513a2b31476a89ac5c53db21c4d69724d3a5b84da4c1d9321c9105cce79d04e1da8bd980e63d01a09849588498c099a4609424a88765be9d2862"

RPROVIDES:${PN} += "config-php8-sodium \
php-sodium \
php8-sodium"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23 \
php"

inherit rpm
