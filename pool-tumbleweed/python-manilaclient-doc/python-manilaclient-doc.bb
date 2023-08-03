SUMMARY = "Documentation for OpenStack Share API Client"
DESCRIPTION = "Client library and command line utility for interacting with Openstack \
Share API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "python-manilaclient-doc-4.2.0-1.7.noarch.rpm"
RPM_HASH = "de97e3d45f46bd61960270f72fc30036d74353350d0ec4b1d8e8bbf2d396a720aada89e2fd8a59beeabd253ce65c9aa194bce220ba0c270f6c91d9b72d443d30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-manilaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
