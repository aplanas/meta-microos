SUMMARY = "Documentation for the Oslo Policy library"
DESCRIPTION = "Documentation for the Oslo Policy library."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python-oslo.policy-doc-4.1.1-1.2.noarch.rpm"
RPM_HASH = "87e61d09bae36727206b6bdb4a2075be8dc6637e1edc60672447b900b637ee965589af63449981ef74dd4bcd2112cbb01b593b228e25ff1ff97d8ae1a191981c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.policy-doc"

RDEPENDS:${PN} += ""

inherit rpm
