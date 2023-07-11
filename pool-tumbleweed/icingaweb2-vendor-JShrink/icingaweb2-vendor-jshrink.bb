SUMMARY = "Icinga Web 2 vendor library JShrink"
DESCRIPTION = "Icinga Web 2 vendor library JShrink."
LICENSE = "BSD-3-Clause"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-JShrink-2.11.4-3.1.noarch.rpm"
RPM_HASH = "5f4cb3d596c34847c14c79c733446b5bd831aec8d39362f87c4efb5271464b980abe7c8e492b0428690f1d453a1b8714df032f62635cfdb075c9bf5a0db462ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-JShrink"

RDEPENDS:${PN} += "icingaweb2-common \
php"

inherit rpm
