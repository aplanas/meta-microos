SUMMARY = "POSIX functions for PHP"
DESCRIPTION = "This module contains an interface to those functions defined in the \
IEEE 1003.1 (POSIX.1) standards document which are not accessible \
through other means."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-posix-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "edf8fc4e9bedc3077f0e8d37270774d76c72bd776b603810c8685c19d5839faaeb09c37ca3c3f7b15d41a691aefc55d7b64bd1d1e7bead650caa57d6413fb32f"

RPROVIDES:${PN} += "config-php8-posix \
php-posix \
php8-posix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
