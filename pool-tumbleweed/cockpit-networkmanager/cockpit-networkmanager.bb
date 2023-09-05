SUMMARY = "Cockpit user interface for networking, using NetworkManager"
DESCRIPTION = "The Cockpit component for managing networking.  This package uses NetworkManager."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-networkmanager-298-2.1.noarch.rpm"
RPM_HASH = "319a96dcaa068909a15f8173e27e073599d202c8535560b4f8b647fcc1692f668f92ae50d343abcd7f3f033333bcdc0fbaa3696e3ad1158bf019bc3e18daf771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-networkmanager"

RDEPENDS:${PN} += "NetworkManager \
cockpit-bridge \
cockpit-shell"

inherit rpm
