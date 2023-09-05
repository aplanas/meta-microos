SUMMARY = "PHP readline extension"
DESCRIPTION = "PHP interface to libedit, which provides editable command line as well \
as PHP interactive mode (php -a)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-readline-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "e6f542f917f0b2b24797b17de3c3c137487487525feac3af982edeb2110e1058648e23cfc5fc273ccc8a22054865407f42e5ef82694d3e940ec1acafabb5a2cd"

RPROVIDES:${PN} += "config-php8-readline \
php-readline \
php8-readline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
php"

inherit rpm
