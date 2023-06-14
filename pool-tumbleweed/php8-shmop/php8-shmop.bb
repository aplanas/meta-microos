SUMMARY = "Alternate, low-level shared memory implementation for PHP"
DESCRIPTION = "An extension created as an alternative to the sysvmsg module."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-shmop-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "7ac204dfdd2e849283e3ef17461562e2b38f16b68caf4d76595cb374cc4ca211d3ca68be314eb070e9239bf61a1054855a11a130eb997c7617cdd98d9669c1f2"

RPROVIDES:${PN} += "config-php8-shmop \
php-shmop \
php8-shmop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
