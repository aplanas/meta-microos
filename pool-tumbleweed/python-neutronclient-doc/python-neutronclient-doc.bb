SUMMARY = "Documentation for OpenStack Neutron API Client"
DESCRIPTION = "Client library and command line utility for interacting with OpenStack \
Neutron's API."
LICENSE = "Apache-2.0"

PV = "7.8.0"

RPM_NAME = "python-neutronclient-doc-7.8.0-1.6.noarch.rpm"
RPM_HASH = "a0dd4d5449c60c044654d2b71a08c2b83576a98da0053855b3a7611d1e4e27bc1283697d4fe6e5ff89d02c9d223b02974b2d46819cce13514b7eb9b4371dcd6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-neutronclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
