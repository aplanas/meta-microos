SUMMARY = "Documentation for python-tooz"
DESCRIPTION = "The Tooz project aims at centralizing the most common distributed primitives \
like group membership protocol, lock service and leader election by providing \
a coordination API helping developers to build distributed applications. \
 \
This package contains documentation in HTML format."
LICENSE = "Apache-2.0"

PV = "2.11.1"

RPM_NAME = "python-tooz-doc-2.11.1-2.5.noarch.rpm"
RPM_HASH = "26a01693e0d9808e3372a04ddab9cef12f934fa1c0dd14b05e3d4ebe934abac2062460b9dbd1b96762925cd9af7daa156e4b3e5a59c323428f82a8454c541ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-tooz-doc"

RDEPENDS:${PN} += ""

inherit rpm
