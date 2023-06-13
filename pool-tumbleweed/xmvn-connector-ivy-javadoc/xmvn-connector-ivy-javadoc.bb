SUMMARY = "API documentation for xmvn-connector-ivy"
DESCRIPTION = "This package provides API documentation for xmvn-connector-ivy."
LICENSE = "Apache-2.0"

PV = "4.0.0~20220623.8da91ea"

RPM_NAME = "xmvn-connector-ivy-javadoc-4.0.0~20220623.8da91ea-1.1.noarch.rpm"
RPM_HASH = "4c16c3e22f76b4ce82c8754914fd8edf40835fbd23310b12c7b7fca1637a7075c183746dcedd9ef3ef7259ad12ee957bd483aa36152972d30eaba61a3435a632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-connector-ivy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
