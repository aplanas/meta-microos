SUMMARY = "Development files for for Cockpit"
DESCRIPTION = "This package contains files used to develop cockpit modules"
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-devel-300.1-1.1.aarch64.rpm"
RPM_HASH = "ab6d9a311c25573fdf6f935b066cb4a83abb678ce4dc56de2fcf145d1e597ea47870a390c0500c29a64e08b39416e7b47c6835f9deb8c260ce483b69e9441585"

RPROVIDES:${PN} += "cockpit-devel"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
