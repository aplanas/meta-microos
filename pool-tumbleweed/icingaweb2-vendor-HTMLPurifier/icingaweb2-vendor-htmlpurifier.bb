SUMMARY = "Icinga Web 2 vendor library HTMLPurifier"
DESCRIPTION = "Icinga Web 2 vendor library HTMLPurifier."
LICENSE = "LGPL-2.1-only"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-HTMLPurifier-2.11.4-2.1.noarch.rpm"
RPM_HASH = "8326a5daedc2a3c747fd74d6ebcec460ebdd2e0c7efd4a331a2063bbe4adb332886ae6defd18f262981c686d76d1d3997c6fd5558d05e8e025c457b429e3e598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-HTMLPurifier"

RDEPENDS:${PN} += "icingaweb2-common \
php"

inherit rpm
