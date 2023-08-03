SUMMARY = "SysV Shared Memory support for PHP"
DESCRIPTION = "PHP interface for System V shared memory."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-sysvshm-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "a447bbb921e34f9e85b7c1fc4913cbb1629a31b65a60552a911f11c0305cc6a1bd43d96be39f95bcc98f21fe9de6634d442f8349261121ea3c3720d55503dd1b"

RPROVIDES:${PN} += "config-php8-sysvshm \
php-sysvshm \
php8-sysvshm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
