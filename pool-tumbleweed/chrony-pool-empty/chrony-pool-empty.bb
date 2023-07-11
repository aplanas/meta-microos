SUMMARY = "Empty pool preconfiguration for chrony"
DESCRIPTION = "This package provides an empty /etc/chrony.d/pool.conf file for \
situations when having servers preconfigured in chrony is undesirable, \
e.g. because the servers will be set via DHCP."
LICENSE = "GPL-2.0-only"

PV = "4.3"

RPM_NAME = "chrony-pool-empty-4.3-2.4.noarch.rpm"
RPM_HASH = "71e893ad482e607d0e85912352fce8ea8226683f543fd2eb40229cfafb951f3dd3ca0d6c33fa8fd3e91b77b2a2b1194599e2ce75f2278c5f1d1bad6f9cb1a073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool \
chrony-pool-empty \
config-chrony-pool-empty"

RDEPENDS:${PN} += "chrony"

inherit rpm
