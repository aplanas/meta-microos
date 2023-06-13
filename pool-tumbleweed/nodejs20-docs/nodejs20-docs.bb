SUMMARY = "Node.js API documentation"
DESCRIPTION = "The API documentation for the Node.js JavaScript runtime."
LICENSE = "MIT"

PV = "20.2.0"

RPM_NAME = "nodejs20-docs-20.2.0-2.1.noarch.rpm"
RPM_HASH = "2848f1c1e291d28c11917e969a2b6918d437202c331a0aea6b044e6b9700feecc3aaba3812f6f13a86b6c34859b9c89528593b92801b457cc27a757ac5d094a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs20-docs"

RDEPENDS:${PN} += ""

inherit rpm
