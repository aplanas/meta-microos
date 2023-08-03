SUMMARY = "Documentation for OpenStack Nova API Client"
DESCRIPTION = "This is a client for the OpenStack Nova API. There's a Python API (the \
novaclient module), and a command-line script (nova). Each implements 100% of \
the OpenStack Nova API. \
 \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "18.3.0"

RPM_NAME = "python-novaclient-doc-18.3.0-1.4.noarch.rpm"
RPM_HASH = "67f8670042420237f54b992867a1c1cdd340b70f48a9fc5a16a9690cb595084094757e4e6096270d9d043ef14b22fdb33e65ad46daaf4cbbfadae85df41820e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-novaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
