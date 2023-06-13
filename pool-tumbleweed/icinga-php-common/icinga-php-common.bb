SUMMARY = "Icinga PHP Common for Icinga Web 2"
DESCRIPTION = "This package manages the directory /usr/share/icinga-php."
LICENSE = "SUSE-Public-Domain"

PV = "1.0.0"

RPM_NAME = "icinga-php-common-1.0.0-1.6.noarch.rpm"
RPM_HASH = "c263fe0944dfbaf98e9e74965211ca4fe05fe029e36136d233ef3d5072d593b47dfcd84d2a2d1cf733a6e4a7aec13df92f3f53633f73b74adeda479a54036bb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icinga-php-common"

RDEPENDS:${PN} += ""

inherit rpm
