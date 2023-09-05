SUMMARY = "SysV Semaphore support for PHP"
DESCRIPTION = "PHP interface for System V semaphores."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-sysvsem-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "cacb66710feb16ceefd6f1d8aad211f4bfed4ade89c39be8cb9edbd87846d734e105509b47cf7c07fdb3e6431f4d1b389cdb923c35f493bf08a7765ca1cc4f73"

RPROVIDES:${PN} += "config-php8-sysvsem \
php-sysvsem \
php8-sysvsem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
