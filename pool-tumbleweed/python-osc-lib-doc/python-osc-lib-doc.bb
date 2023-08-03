SUMMARY = "Documentation for the OpenStack client library"
DESCRIPTION = "Documentation for the OpenStack client library."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "python-osc-lib-doc-2.7.0-1.3.noarch.rpm"
RPM_HASH = "ac2ccc51835981989f00bf37358c59a0ceb63ca4c9d7c5f7cfcb7d426b7bb8816482073c059f547c597b85545aafb234fd5ecc1b2a76cbf72ea1066800a7b4bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-osc-lib-doc"

RDEPENDS:${PN} += ""

inherit rpm
