SUMMARY = "Cockpit user interface for packages"
DESCRIPTION = "The Cockpit components for installing OS updates and Cockpit add-ons, \
via PackageKit."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-packagekit-276.1-4.3.noarch.rpm"
RPM_HASH = "d3dd7b69b09191976a8ceb993da2aa8746ed1bcf695bd9d91d9f02bddf7a8a321a7920d2561c237096850fb55ebde8f8aaa58954e52665a0c9a1e11c1bc7508e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-packagekit"
RDEPENDS:${PN} += "PackageKit cockpit-bridge polkit"

inherit rpm
