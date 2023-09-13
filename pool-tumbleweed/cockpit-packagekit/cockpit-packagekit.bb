SUMMARY = "Cockpit user interface for packages"
DESCRIPTION = "The Cockpit components for installing OS updates and Cockpit add-ons, \
via PackageKit."
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-packagekit-300.1-1.1.noarch.rpm"
RPM_HASH = "216211cdefc83318001da543e4607e259002702f1cbfc9473dfc0eacb9850c8527208ded74f099375f8bacf2d411dd4ead16b93d21e0b20935729259d92bd409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-packagekit"

RDEPENDS:${PN} += "PackageKit \
cockpit-bridge \
polkit"

inherit rpm
