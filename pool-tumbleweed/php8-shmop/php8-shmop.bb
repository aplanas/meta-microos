SUMMARY = "Alternate, low-level shared memory implementation for PHP"
DESCRIPTION = "An extension created as an alternative to the sysvmsg module."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-shmop-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "3431b5fde52ed5ab79a123136c18a38d1bac5c32acf74046e5c3ae5833d3ea02d40510379f20a74b9765eadf267242fa8975eb2cba33ea8f140f87474ec2ea2e"

RPROVIDES:${PN} += "config-php8-shmop \
php-shmop \
php8-shmop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
