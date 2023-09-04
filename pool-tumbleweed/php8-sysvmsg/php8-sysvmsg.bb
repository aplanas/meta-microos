SUMMARY = "SysV Message Queue support for PHP"
DESCRIPTION = "This module provides System V Message Queue support."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-sysvmsg-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "1268bd61bb4ab1be9446b3c1343f7bcbd21bff041763ff2c5148e7ca119451fac2bc8362377ffc6a19953b58f5ea7fbb94b74247c73d0fbd419b7bb4509bf7e5"

RPROVIDES:${PN} += "config-php8-sysvmsg \
php-sysvmsg \
php8-sysvmsg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
