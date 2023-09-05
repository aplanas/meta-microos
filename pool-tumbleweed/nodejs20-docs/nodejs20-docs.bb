SUMMARY = "Node.js API documentation"
DESCRIPTION = "The API documentation for the Node.js JavaScript runtime."
LICENSE = "MIT"

PV = "20.5.1"

RPM_NAME = "nodejs20-docs-20.5.1-2.1.noarch.rpm"
RPM_HASH = "b4464c89714f3145cbd2dec66f65cb5ab29403453b6b93164e8507a667f6b5945415e86f6da27f7e1cb880a33506154339a9fcd0a9e6af4831e8b9a7ff973e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs20-docs"

RDEPENDS:${PN} += ""

inherit rpm
