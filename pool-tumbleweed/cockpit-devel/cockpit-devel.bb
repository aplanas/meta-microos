SUMMARY = "Development files for for Cockpit"
DESCRIPTION = "This package contains files used to develop cockpit modules"
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-devel-298-2.1.aarch64.rpm"
RPM_HASH = "4ebc76645d4da2a5eca93d959e080349e2ee0c5cddabca7c426c9d7066de02f19aa84492bc7aa8dd0e8d99933f1f4c7495ed55d27d6de644fc15e9b4e459d39c"

RPROVIDES:${PN} += "cockpit-devel"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
