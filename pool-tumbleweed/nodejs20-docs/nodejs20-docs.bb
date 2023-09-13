SUMMARY = "Node.js API documentation"
DESCRIPTION = "The API documentation for the Node.js JavaScript runtime."
LICENSE = "MIT"

PV = "20.6.0"

RPM_NAME = "nodejs20-docs-20.6.0-2.1.noarch.rpm"
RPM_HASH = "1de817bf8f717c938f7b680ca023a071ba44a0dac13a0ab26dd2d128e2fd0d82e119edc8ebabf902a1548f56ebee1770c569c40e9e5d18bcbc9f62d6ebfa5a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs20-docs"

RDEPENDS:${PN} += ""

inherit rpm
