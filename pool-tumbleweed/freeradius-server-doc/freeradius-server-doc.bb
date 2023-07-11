SUMMARY = "FreeRADIUS Documentation"
DESCRIPTION = "FreeRADIUS documentation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-doc-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "1546652559ceb7f51a19a2e2db4d4d4d5773d35ea651872f4385027a250d7dfc3351ef771a18e59027aba335489be14f9149aa4b81a66668d534ad80763f6d3a"

RPROVIDES:${PN} += "freeradius-server-doc"

RDEPENDS:${PN} += ""

inherit rpm
