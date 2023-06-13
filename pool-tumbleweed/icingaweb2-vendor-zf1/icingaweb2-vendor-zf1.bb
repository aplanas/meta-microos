SUMMARY = "Icinga Web 2's fork of Zend Framework 1"
DESCRIPTION = "Icinga Web 2's fork of Zend Framework 1."
LICENSE = "BSD-3-Clause"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-zf1-2.11.4-2.1.noarch.rpm"
RPM_HASH = "aff5c5b7a6c4a424efd1f32025504ffe6315da08a4e7da07e21f520b253444490f3439534eeb5c50e7b07ced59f279b3c8778b9499c71b0e859d9e2e77427dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-Zend \
icingaweb2-vendor-zf1"

RDEPENDS:${PN} += "icingaweb2-common \
php"

inherit rpm
