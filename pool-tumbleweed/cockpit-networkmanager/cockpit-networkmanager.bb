SUMMARY = "Cockpit user interface for networking, using NetworkManager"
DESCRIPTION = "The Cockpit component for managing networking.  This package uses NetworkManager."
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-networkmanager-300.1-1.1.noarch.rpm"
RPM_HASH = "2d56e3ef19e53736abe8b987b702bb29e2d1250acb2eb1d9700933f04c555cd9cfb67a8ae4629a2b7a46e24d198523093f4e45adc54f2cfb4bf2667807f9f4eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-networkmanager"

RDEPENDS:${PN} += "NetworkManager \
cockpit-bridge \
cockpit-shell"

inherit rpm
