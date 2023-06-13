SUMMARY = "Dependencies required for Adminer MySQL support"
DESCRIPTION = "Virtual package that requires dependencies needed for Adminer MySQL support"
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-mysql-4.8.1-1.6.noarch.rpm"
RPM_HASH = "6931f72b53a2a5e4b9ba1d38a1ebe14db709553d1cfa92d31947860a4c87fee805f4cf62ad80bb0e20d97362742da41a3bc6f2e2f0bb2bfdd6ac0dd4beb1999c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer-database-support \
adminer-mysql"

RDEPENDS:${PN} += "adminer \
php-mysql"

inherit rpm
