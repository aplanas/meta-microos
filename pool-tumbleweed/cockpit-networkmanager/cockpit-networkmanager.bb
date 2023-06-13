SUMMARY = "Cockpit user interface for networking, using NetworkManager"
DESCRIPTION = "The Cockpit component for managing networking.  This package uses NetworkManager."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-networkmanager-276.1-4.4.noarch.rpm"
RPM_HASH = "e3dd9c23f27eada5ede48dff0c5167d535440a449f89f911f18d0808cebc5c311f7de62c42f08a6d59b451b42da802e27fadc65146a51aad9dbc6f19318bede9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-networkmanager"

RDEPENDS:${PN} += "NetworkManager \
cockpit-bridge \
cockpit-shell"

inherit rpm
