SUMMARY = "SysV Semaphore support for PHP"
DESCRIPTION = "PHP interface for System V semaphores."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-sysvsem-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "0f16b648f32fc3545d8166c0f7d0302047e1a75c7ddb778c85f85bad4c5201f1ab652fd097f110b65baeb04c147c8725574933a7d3fe3502096dfe165b03f30f"

RPROVIDES:${PN} += "config-php8-sysvsem \
php-sysvsem \
php8-sysvsem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
