SUMMARY = "Default Card Decks for KDE Games"
DESCRIPTION = "This package contains the default card deck set for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kdegames-carddecks-default-23.08.0-1.1.noarch.rpm"
RPM_HASH = "369c39b232df746217d3c71c25f8a011e99910354f11bbbd46eae1b836e5619e0943eb83c7df36bdd87fd1beaa20c838a124ae14208adbb6dda567088655615d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdegames-carddecks-default"

RDEPENDS:${PN} += ""

inherit rpm
