SUMMARY = "Documentation for OpenStack Share API Client"
DESCRIPTION = "Client library and command line utility for interacting with Openstack \
Share API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "python-manilaclient-doc-4.2.0-1.6.noarch.rpm"
RPM_HASH = "8cc22060b40f8e8c11ca85edb9e88d429ee5846f64dfe6104cb0099eb427cd14c06725c64969659b159a99e141a2064ee4b9fc4faa2ccd5649bef29fc48f2580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-manilaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
