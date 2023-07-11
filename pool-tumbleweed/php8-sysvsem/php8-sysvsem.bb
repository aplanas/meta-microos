SUMMARY = "SysV Semaphore support for PHP"
DESCRIPTION = "PHP interface for System V semaphores."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-sysvsem-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "eaf6926a2d97427f44656370510d1a7c81d7395b51976619142d08a361e4eb0cc356413ac9ef3cc063c4be5ce4d11126316596d5864733e131809eec26e1949a"

RPROVIDES:${PN} += "config-php8-sysvsem \
php-sysvsem \
php8-sysvsem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
