SUMMARY = "SysV Shared Memory support for PHP"
DESCRIPTION = "PHP interface for System V shared memory."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-sysvshm-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "e4b982176df4cda8cf3e08d267037ad19180259e7413bca2785f5a54ef6c5829c0bea56285417e0a892b15d1157f3749386a9d0c4571f412d1d119f1d56229aa"

RPROVIDES:${PN} += "config(php8-sysvshm) \
php-sysvshm \
php8-sysvshm \
php8-sysvshm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
php"

inherit rpm
