SUMMARY = "An SDK for building applications to work with OpenStack - Documentation"
DESCRIPTION = "The openstacksdk is a library for building applications to work \
with OpenStack clouds. \
The project aims to provide a consistent and complete set of \
interactions with OpenStack's many services, along with complete \
documentation, examples, and tools. \
 \
The openstacksdk is a collection of libraries for building \
applications to work with OpenStack clouds."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python-openstacksdk-doc-1.0.1-1.3.noarch.rpm"
RPM_HASH = "2e0b6beb3dbb93e49caf3f83596559cf69f4c74888fefd013326cae460347428d82749d372615872c8c5039015ffabde98770c9279d684ef60c0079ce30b2f63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-openstacksdk-doc"

RDEPENDS:${PN} += ""

inherit rpm
