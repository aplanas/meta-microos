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

PV = "1.3.1"

RPM_NAME = "python-openstacksdk-doc-1.3.1-1.1.noarch.rpm"
RPM_HASH = "a2b58e4cd06b66492df36af6bbf19db497bef011c87900cbc2a6d104fdbcb3f6b90148de076c2112f0746a2614da4e297f57941ad327e734bea8cf09c20ad85a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-openstacksdk-doc"

RDEPENDS:${PN} += ""

inherit rpm
