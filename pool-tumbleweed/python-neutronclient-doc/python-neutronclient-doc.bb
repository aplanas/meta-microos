SUMMARY = "Documentation for OpenStack Neutron API Client"
DESCRIPTION = "Client library and command line utility for interacting with OpenStack \
Neutron's API."
LICENSE = "Apache-2.0"

PV = "7.8.0"

RPM_NAME = "python-neutronclient-doc-7.8.0-1.5.noarch.rpm"
RPM_HASH = "b2609425c9e5bccfbd12cff5ea75570c3b4bc99e48d4a1acc8d8d203308854a324aae8189e80efc89fec2b06748a59e4e890f8bed910aa875fa5bba0a6c0d538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-neutronclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
