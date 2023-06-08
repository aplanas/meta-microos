SUMMARY = "FreeRADIUS Documentation"
DESCRIPTION = "FreeRADIUS documentation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-doc-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "3f9b7ad5d9474bb422a54d79b75051505da2ed84b9fb673401fc6472699d9adfa81e2eea626e8aae0de7f3f27ed03396a3be488893e80ef6b36d550b1c53c6d0"

RPROVIDES:${PN} += "freeradius-server-doc freeradius-server-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
