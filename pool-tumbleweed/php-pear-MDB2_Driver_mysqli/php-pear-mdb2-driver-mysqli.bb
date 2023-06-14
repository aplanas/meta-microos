SUMMARY = "MySQLi MDB2 driver"
DESCRIPTION = "This is the MySQLi MDB2 driver."
LICENSE = "BSD-3-Clause"

PV = "1.5.0b4"

RPM_NAME = "php-pear-MDB2_Driver_mysqli-1.5.0b4-1.10.noarch.rpm"
RPM_HASH = "db1402c299540d61dfb2055ae0cf419f64e5bbcbbbf481aab45000d679dc8fce055e1c732a3f4304b118b66a16103cb9ce01be3c8b1705889274a4078cce9320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-MDB2-Driver-mysqli \
php5-pear-MDB2-Driver-mysqli \
php7-pear-MDB2-Driver-mysqli"

RDEPENDS:${PN} += "/bin/sh \
php-mysql \
php-pear \
php-pear-MDB2"

inherit rpm
