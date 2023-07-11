SUMMARY = "Cockpit user interface for packages"
DESCRIPTION = "The Cockpit components for installing OS updates and Cockpit add-ons, \
via PackageKit."
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-packagekit-293-1.1.noarch.rpm"
RPM_HASH = "521c8773d07aad96dd47ded34a72531813b5c932af457ad8f21c4f908da3b31e4300d85b21173692614fee7d176184f67da995457822a641e9daa781b7051b19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-packagekit"

RDEPENDS:${PN} += "PackageKit \
cockpit-bridge \
polkit"

inherit rpm
