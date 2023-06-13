SUMMARY = "Node.js API documentation"
DESCRIPTION = "The API documentation for the Node.js JavaScript runtime."
LICENSE = "MIT"

PV = "18.16.0"

RPM_NAME = "nodejs18-docs-18.16.0-1.2.noarch.rpm"
RPM_HASH = "3efae38a4d2d89a67ef78a2a04c956373f77702b917b2d7370c67b41a0293b624ac4e7d1f8fb23af3516e089904c1df05f3721f7b3e77e6f86ab7613911719db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs18-docs"

RDEPENDS:${PN} += ""

inherit rpm
