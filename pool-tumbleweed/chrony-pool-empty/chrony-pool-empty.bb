SUMMARY = "Empty pool preconfiguration for chrony"
DESCRIPTION = "This package provides an empty /etc/chrony.d/pool.conf file for \
situations when having servers preconfigured in chrony is undesirable, \
e.g. because the servers will be set via DHCP."
LICENSE = "GPL-2.0-only"

PV = "4.4"

RPM_NAME = "chrony-pool-empty-4.4-1.1.noarch.rpm"
RPM_HASH = "cab0f5fe4eca470906ea3663cccaac4b4fa6629feec4f7c18a1be8789772b4187337cb9906aa806b5a610090232003dc3b1fe0f9b0a77d120c352791281e3d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool \
chrony-pool-empty \
config-chrony-pool-empty"

RDEPENDS:${PN} += "chrony"

inherit rpm
