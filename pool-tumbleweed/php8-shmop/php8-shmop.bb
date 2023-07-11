SUMMARY = "Alternate, low-level shared memory implementation for PHP"
DESCRIPTION = "An extension created as an alternative to the sysvmsg module."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-shmop-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "0730dd088181ec3847d9917ed49f4fef0c3abcde7c50e4e114dc14b0cc01cbbd7242a44420ac88f1e62b4f36d067bb1a16200f953354fff15fc4e142c0a1037a"

RPROVIDES:${PN} += "config-php8-shmop \
php-shmop \
php8-shmop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
