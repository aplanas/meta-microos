SUMMARY = "Documentation for OpenStack Identity API Client"
DESCRIPTION = "Documentation for the client library for interacting with Openstack \
Identity API."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python-keystoneclient-doc-5.1.0-1.1.noarch.rpm"
RPM_HASH = "802fe975474ed08b2ff5870daeb611153294105ede119d51a335c5727e97b1a0d7088c1f4be878b3c8f77109d8ecb026e0ea8a26c75c91fe8d3c704e496ff91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-keystoneclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
