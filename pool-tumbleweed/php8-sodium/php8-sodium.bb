SUMMARY = "Cryptographic Extension Based on Libsodium"
DESCRIPTION = "PHP binding to libsodium software library for encryption, decryption, \
signatures, password hashing and more."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-sodium-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "bb65d02c5e2309377239ac498aa4e2e412a23b0973b52b49ddb4935036cbce6186229a3b88a3703693e9d0605f3cf81c25d92ff8140a9291f3992d554df0557c"

RPROVIDES:${PN} += "config-php8-sodium \
php-sodium \
php8-sodium"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23 \
php"

inherit rpm
