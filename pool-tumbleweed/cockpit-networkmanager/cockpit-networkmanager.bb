SUMMARY = "Cockpit user interface for networking, using NetworkManager"
DESCRIPTION = "The Cockpit component for managing networking.  This package uses NetworkManager."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-networkmanager-298-1.1.noarch.rpm"
RPM_HASH = "8ddb3b672633f2f1cadb4303565cf5b1fb2068cffe7656a66b8ac656db47e540f5ecab580f381e850136e1e5085aa52891e64f4e806297544bf39960de73ce5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-networkmanager"

RDEPENDS:${PN} += "NetworkManager \
cockpit-bridge \
cockpit-shell"

inherit rpm
