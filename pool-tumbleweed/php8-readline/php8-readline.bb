SUMMARY = "PHP readline extension"
DESCRIPTION = "PHP interface to libedit, which provides editable command line as well \
as PHP interactive mode (php -a)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-readline-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "bdc11fdbfe4b09b8ddf07f59a27788b5abadcf13092f526b234a56d803646c07e148836491f588ce2d7bd06a0123561a38a03d140cb0edd81ef62fd8d3066617"

RPROVIDES:${PN} += "config-php8-readline \
php-readline \
php8-readline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
php"

inherit rpm
