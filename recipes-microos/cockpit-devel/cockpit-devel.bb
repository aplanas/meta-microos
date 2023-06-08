SUMMARY = "Development files for for Cockpit"
DESCRIPTION = "This package contains files used to develop cockpit modules"
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-devel-276.1-4.3.aarch64.rpm"
RPM_HASH = "96ed0e6fca2c709adda46a93323cb614dbfbce53a539acb3580c39f6293ab352f246480f2a48bde6101bbbd48701b6f09a50e108eb774fd6bb133d1aa8df7029"

RPROVIDES:${PN} += "cockpit-devel cockpit-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
