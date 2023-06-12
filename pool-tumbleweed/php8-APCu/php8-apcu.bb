SUMMARY = "APCu - APC User Cache"
DESCRIPTION = "APCu is userland caching: APC stripped of opcode caching in preparation \
for the deployment of Zend Optimizer+ as the primary solution to opcode \
caching in future versions of PHP."
LICENSE = "PHP-3.01"

PV = "5.1.22"

RPM_NAME = "php8-APCu-5.1.22-2.4.aarch64.rpm"
RPM_HASH = "29b5ad1528eb7f0bc5861eda19c2fe2dee0b5dd9532c5341de3f64a3cc3314632620b41313faa85f62564a9abb18054f67cfbd43b12b616c383e8eaedfb6ecbe"

RPROVIDES:${PN} += "config(php8-APCu) \
php-APCu \
php8-APCu \
php8-APCu(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
php(api) \
php(zend-abi)"

inherit rpm
