SUMMARY = "API documentation for xbean"
DESCRIPTION = "This package provides API documentation for xbean."
LICENSE = "Apache-2.0"

PV = "4.20"

RPM_NAME = "xbean-javadoc-4.20-1.6.noarch.rpm"
RPM_HASH = "61470ad90da0e8749a8f118a1ea007a8f4daba2a08695b1b8bc47bb639fa34bf10ec58802a09bad7b9845effc9e08ab3575945d0de3306eb4705735a9affd0dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xbean-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
