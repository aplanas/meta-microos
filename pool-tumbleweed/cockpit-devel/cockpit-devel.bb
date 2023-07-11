SUMMARY = "Development files for for Cockpit"
DESCRIPTION = "This package contains files used to develop cockpit modules"
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-devel-293-1.1.aarch64.rpm"
RPM_HASH = "0c316d44a5048a7bdf5b84db6bd0a4b6558fa6f09de61c55063bc7659e6145d6dd2d9c2436062d2705075a71bd0dfbe7f2ab8af15019dc4781bc15a239d9f0e8"

RPROVIDES:${PN} += "cockpit-devel"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
