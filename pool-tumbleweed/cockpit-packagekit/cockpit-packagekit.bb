SUMMARY = "Cockpit user interface for packages"
DESCRIPTION = "The Cockpit components for installing OS updates and Cockpit add-ons, \
via PackageKit."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-packagekit-276.1-4.4.noarch.rpm"
RPM_HASH = "0056582bbd14d04a9eadbbea753c2427e9f3477d477529983d0d68f0f5bf08bff34a1b6a119865632b9c29670721e17e4d859c0204a3518014d5fe8d17b5f404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-packagekit"
RDEPENDS:${PN} += "PackageKit \
cockpit-bridge \
polkit"

inherit rpm
