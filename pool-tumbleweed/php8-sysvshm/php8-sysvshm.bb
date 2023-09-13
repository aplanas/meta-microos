SUMMARY = "SysV Shared Memory support for PHP"
DESCRIPTION = "PHP interface for System V shared memory."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-sysvshm-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "3e3f1b18e8aee9719dd5ecff8867060cf389730302a4c26f15687be220e6b399fa4e8c59fccdf48b1decc2e4051faf60c5fd51910b34792cdf0d66b97bd8dea9"

RPROVIDES:${PN} += "config-php8-sysvshm \
php-sysvshm \
php8-sysvshm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
