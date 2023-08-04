SUMMARY = "API documentation for xmvn-tools"
DESCRIPTION = "This package provides API documentation for xmvn-tools."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-tools-javadoc-4.2.0-4.1.noarch.rpm"
RPM_HASH = "076a68efe6cf6fb9ab9a2cab0e273307d1a7678f9139d3b03a10f6b7ea837988bafe7f7628835b021377c53a2d81e93610c4c22a83cc9e0ad82d3aedc72710ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
