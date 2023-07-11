SUMMARY = "PHP UUID support functions"
DESCRIPTION = "This extension provides functions to generate and analyse \
universally unique identifiers (UUIDs)."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "php8-uuid-1.2.0-2.5.aarch64.rpm"
RPM_HASH = "573afc231a72b924a98abbe4c570348ae3d538a85e827cca1e94c41bce72f01d9cb3fe52c0c9d993cfae1d20227a1b23f3b2bba6eeb139f627586b6757e332f1"

RPROVIDES:${PN} += "config-php8-uuid \
php-uuid \
php8-uuid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1 \
php-api \
php-zend-abi"

inherit rpm
