SUMMARY = "POSIX functions for PHP"
DESCRIPTION = "This module contains an interface to those functions defined in the \
IEEE 1003.1 (POSIX.1) standards document which are not accessible \
through other means."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-posix-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "6fbb2699e7bde3960a4514d551470e8b73986c712d12a1bb708d4dbd03abdbcb45d6ec67b17bce5854d4480ea23ba9da3e5ac0bac8657ad4163054f4494d71cd"

RPROVIDES:${PN} += "config-php8-posix \
php-posix \
php8-posix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
