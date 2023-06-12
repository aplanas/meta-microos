SUMMARY = "Empty pool preconfiguration for chrony"
DESCRIPTION = "This package provides an empty /etc/chrony.d/pool.conf file for \
situations when having servers preconfigured in chrony is undesirable, \
e.g. because the servers will be set via DHCP."
LICENSE = "GPL-2.0-only"

PV = "4.3"

RPM_NAME = "chrony-pool-empty-4.3-2.3.noarch.rpm"
RPM_HASH = "bd3d63e455f6d34dbe3868eaec61ee1131db6a78b514beefb91257a1974c0fa8a9e524fc66692bb43e0c894fdff4482b8ab3afb1214870485e8d6c71723aa214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool \
chrony-pool-empty \
config(chrony-pool-empty)"
RDEPENDS:${PN} += "chrony"

inherit rpm
