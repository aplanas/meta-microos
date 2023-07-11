SUMMARY = "APCu - APC User Cache"
DESCRIPTION = "APCu is userland caching: APC stripped of opcode caching in preparation \
for the deployment of Zend Optimizer+ as the primary solution to opcode \
caching in future versions of PHP."
LICENSE = "PHP-3.01"

PV = "5.1.22"

RPM_NAME = "php8-APCu-5.1.22-2.5.aarch64.rpm"
RPM_HASH = "f1acc3091109e755e827248a39f21a14102cb6463082e3e6fbce07132b7b87d76e1fbd804dba7507f1f74c592820ce2298911e951831a0915c793c4bc86d4a82"

RPROVIDES:${PN} += "config-php8-APCu \
php-APCu \
php8-APCu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php-api \
php-zend-abi"

inherit rpm
