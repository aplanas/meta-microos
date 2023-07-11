SUMMARY = "Node.js API documentation"
DESCRIPTION = "The API documentation for the Node.js JavaScript runtime."
LICENSE = "MIT"

PV = "20.3.1"

RPM_NAME = "nodejs20-docs-20.3.1-1.1.noarch.rpm"
RPM_HASH = "50caade54ef9bc80366bc86592b94fe5063c19ca3bb99386bca7c6a50429f3f65c9dde9de1fb779b45a4d4f1cf8dc495503ea83427a4c2e77843113705d74c00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs20-docs"

RDEPENDS:${PN} += ""

inherit rpm
