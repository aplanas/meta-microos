SUMMARY = "PHP readline extension"
DESCRIPTION = "PHP interface to libedit, which provides editable command line as well \
as PHP interactive mode (php -a)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-readline-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "c2e60ca158f2df34daf015e7122f4a24aae675d6a804ab726016dddc157b04fe5dc7b2654aad2b78714a59043cba8c5fd8a65f64f420091846cee6b0da75e365"

RPROVIDES:${PN} += "config-php8-readline \
php-readline \
php8-readline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
php"

inherit rpm
