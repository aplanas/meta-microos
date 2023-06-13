SUMMARY = "Development files for for Cockpit"
DESCRIPTION = "This package contains files used to develop cockpit modules"
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-devel-276.1-4.4.aarch64.rpm"
RPM_HASH = "2fb3d5f13fe43ec6bd154e775830c28a327d0115a41231ae25114304ca9cd3f7286776a3ccf34fe06f5235140cea4e9237b27bd35ed8bea306315fc2b18587a5"

RPROVIDES:${PN} += "cockpit-devel \
cockpit-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
