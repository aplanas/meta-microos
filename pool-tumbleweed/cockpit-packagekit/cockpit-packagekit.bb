SUMMARY = "Cockpit user interface for packages"
DESCRIPTION = "The Cockpit components for installing OS updates and Cockpit add-ons, \
via PackageKit."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-packagekit-298-1.1.noarch.rpm"
RPM_HASH = "63de832b4d857c25bb476d0295b874c1b10038e2295b551eae2f89cb036cf8a33ccc836e578390391b1d7d38392ec7eba8d1169759241c92856b34f4e86974b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-packagekit"

RDEPENDS:${PN} += "PackageKit \
cockpit-bridge \
polkit"

inherit rpm
