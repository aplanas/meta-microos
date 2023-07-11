SUMMARY = "PHP readline extension"
DESCRIPTION = "PHP interface to libedit, which provides editable command line as well \
as PHP interactive mode (php -a)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-readline-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "90bf8ab3930b967a32e4d7f767a767524e26a2f53d01a3ffcbd7766a1125952e83ceffaa214cff03ffd6532526376962d79c05a5cc56280e0072589ed88761b4"

RPROVIDES:${PN} += "config-php8-readline \
php-readline \
php8-readline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
php"

inherit rpm
