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

RPM_NAME = "python-openstacksdk-doc-1.0.1-1.4.noarch.rpm"
RPM_HASH = "75bb3d837036f6fc607f1cea138242b484fe3bc166edd7b51a946b498b1106b30c4ac9ac368278d4312ca471d47cb6100a49be6ef9049afdf198ee06ef9c1e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-openstacksdk-doc"

RDEPENDS:${PN} += ""

inherit rpm
