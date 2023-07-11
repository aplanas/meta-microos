SUMMARY = "Documentation for OpenStack Identity API Client"
DESCRIPTION = "Documentation for the client library for interacting with Openstack \
Identity API."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python-keystoneclient-doc-4.5.0-1.6.noarch.rpm"
RPM_HASH = "b6528d6e01e3e43b0525083e7a3985f16c8942a910fdc7683eca2b8b0805910be1b8439227205bf6dd481383ea3e3a6b1d3c5993271dcdab9244f801c4c683f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-keystoneclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
