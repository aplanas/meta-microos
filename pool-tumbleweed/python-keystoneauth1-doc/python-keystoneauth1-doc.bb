SUMMARY = "Documentation for OpenStack authenticating tools"
DESCRIPTION = "Documentation for OpenStack authenticating tools."
LICENSE = "Apache-2.0"

PV = "5.2.1"

RPM_NAME = "python-keystoneauth1-doc-5.2.1-1.1.noarch.rpm"
RPM_HASH = "6cfe3eb8dfa9437cef8730d477c28878f563a51f7c02e2c0389df545c80d4b8ccc03d812cf1a6a3b63e40fb1436503a05d347a3155ce0f5dc4a2908c2104513c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-keystoneauth1-doc"

RDEPENDS:${PN} += ""

inherit rpm
