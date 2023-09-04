SUMMARY = "Node.js API documentation"
DESCRIPTION = "The API documentation for the Node.js JavaScript runtime."
LICENSE = "MIT"

PV = "20.5.1"

RPM_NAME = "nodejs20-docs-20.5.1-1.1.noarch.rpm"
RPM_HASH = "352b8c92421666e24881fda5be03a112d0e80e6aa3b95252760d7c00a603980d284e136704ac07457f6fd11d9071d58a039454f883a8b04369ca8a162553ad08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs20-docs"

RDEPENDS:${PN} += ""

inherit rpm
