SUMMARY = "POSIX functions for PHP"
DESCRIPTION = "This module contains an interface to those functions defined in the \
IEEE 1003.1 (POSIX.1) standards document which are not accessible \
through other means."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-posix-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "0f4483c884919f17bedd26034bbeb9ef94f7c08f1616e8dbd50de6b9436e5407000a2c92511aea7516c48bd9d7947336a189ac02890a5768e2a336a09d6b8290"

RPROVIDES:${PN} += "config-php8-posix \
php-posix \
php8-posix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
