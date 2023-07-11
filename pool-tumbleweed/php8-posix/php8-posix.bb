SUMMARY = "POSIX functions for PHP"
DESCRIPTION = "This module contains an interface to those functions defined in the \
IEEE 1003.1 (POSIX.1) standards document which are not accessible \
through other means."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-posix-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "4c89fa1ad6579ed9faefd18c42864193203b0726366381373cb225b1f7ff2acfc4ad5876d4878a3d4c0252269edc101abb16c1615e21e1b643c223f5202ed47e"

RPROVIDES:${PN} += "config-php8-posix \
php-posix \
php8-posix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
