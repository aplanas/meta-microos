SUMMARY = "PHP framework delivered as C extension"
DESCRIPTION = "ICE is a PHP framework delivered as C extension. You do not need \
learn or use the C language, since the functionality is exposed as \
PHP classes."
LICENSE = "BSD-3-Clause"

PV = "1.10.1"

RPM_NAME = "php8-ice-1.10.1-8.1.aarch64.rpm"
RPM_HASH = "78441b9cbdd3869afe2bae1b7ece2cafdf3c83141d6612de4ce63e619cefac9d8b0082620b5005360d645f654a7a65a7d798f449353781493ec38c421e526537"

RPROVIDES:${PN} += "config-php8-ice \
php8-ice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
