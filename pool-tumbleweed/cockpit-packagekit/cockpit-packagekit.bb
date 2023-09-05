SUMMARY = "Cockpit user interface for packages"
DESCRIPTION = "The Cockpit components for installing OS updates and Cockpit add-ons, \
via PackageKit."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-packagekit-298-2.1.noarch.rpm"
RPM_HASH = "c28b40a5b2b14ff62e74f36842a354fb1778c6877928973fa1667e32463ffb84efdbcaf5fc56430b82060b107980f1c90e0f6a0d5e16834232f7ea175d1d1b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-packagekit"

RDEPENDS:${PN} += "PackageKit \
cockpit-bridge \
polkit"

inherit rpm
