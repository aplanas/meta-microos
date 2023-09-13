SUMMARY = "SysV Semaphore support for PHP"
DESCRIPTION = "PHP interface for System V semaphores."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-sysvsem-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "1586c4fe239175df1f127b9aa3fd874bf731ebe88b85bec88b478762cb4a58ed5be4bdadb36e3afb1f05519416d75b0fbfcca2835f89b5fb43b63e1f82925d77"

RPROVIDES:${PN} += "config-php8-sysvsem \
php-sysvsem \
php8-sysvsem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
