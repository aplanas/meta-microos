SUMMARY = "SysV Shared Memory support for PHP"
DESCRIPTION = "PHP interface for System V shared memory."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-sysvshm-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "eedbad11c16d7aa6f9d0307624bc07d0ad9f6386fac5bedba7593a46f8bb029b2b463ab391965a88e6ca9f62ea3424c16567a786977a1cfcdb4a1993ee2855d1"

RPROVIDES:${PN} += "config-php8-sysvshm \
php-sysvshm \
php8-sysvshm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
