SUMMARY = "SysV Shared Memory support for PHP"
DESCRIPTION = "PHP interface for System V shared memory."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-sysvshm-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "9bb760bef98dbc954d000b8f666221a47b9b6c2c8bafe0a85f3357ea9c03d5ee2e886d34c8f615a3ec96b1d6a8e466031389b9ebb2e6db9b079f913239340166"

RPROVIDES:${PN} += "config-php8-sysvshm \
php-sysvshm \
php8-sysvshm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
