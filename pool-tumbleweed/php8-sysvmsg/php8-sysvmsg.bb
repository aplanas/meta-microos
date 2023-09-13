SUMMARY = "SysV Message Queue support for PHP"
DESCRIPTION = "This module provides System V Message Queue support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-sysvmsg-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "cf282880eb21c5bdb929b464a6bee23b697dae16f80cfd4640a26a8153d44c8a7b606f9f61051d330d8000ef2431c3034600233274a931f317251bb5f1005c40"

RPROVIDES:${PN} += "config-php8-sysvmsg \
php-sysvmsg \
php8-sysvmsg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
