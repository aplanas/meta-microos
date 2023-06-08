SUMMARY = "Cockpit user interface for networking, using NetworkManager"
DESCRIPTION = "The Cockpit component for managing networking.  This package uses NetworkManager."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-networkmanager-276.1-4.3.noarch.rpm"
RPM_HASH = "887e8c45bd03ef3ef595974a35b244ee85862726832627b9147642004868f0a44d66ca071f709bf7d6c9f6b3e191a1263f9ff8b7aec31d0f41c2b9757a123fb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-networkmanager"
RDEPENDS:${PN} += "NetworkManager cockpit-bridge cockpit-shell"

inherit rpm
