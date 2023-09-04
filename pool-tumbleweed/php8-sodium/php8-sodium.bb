SUMMARY = "Cryptographic Extension Based on Libsodium"
DESCRIPTION = "PHP binding to libsodium software library for encryption, decryption, \
signatures, password hashing and more."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-sodium-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "cdbbc88aaeabd906a4d5add466fe878b58e6dbbce7940a821ad9ca0ed29ff8e8c91c375993714829f2edf5eb52cca5c68b66f41a98189caebeefee74cf535973"

RPROVIDES:${PN} += "config-php8-sodium \
php-sodium \
php8-sodium"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23 \
php"

inherit rpm
