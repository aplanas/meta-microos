SUMMARY = "Cockpit user interface for networking, using NetworkManager"
DESCRIPTION = "The Cockpit component for managing networking.  This package uses NetworkManager."
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-networkmanager-293-1.1.noarch.rpm"
RPM_HASH = "fa1ab8abdef70cf6379250bcb1a5afe9e0ac7b79b5e83f5c3aa469a74386bc21ea0d7c606b29e3b9ce990146f22432a4f889893054b93b82cf46cbb304a7b48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-networkmanager"

RDEPENDS:${PN} += "NetworkManager \
cockpit-bridge \
cockpit-shell"

inherit rpm
