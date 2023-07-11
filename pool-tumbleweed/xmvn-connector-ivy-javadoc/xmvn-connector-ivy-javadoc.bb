SUMMARY = "API documentation for xmvn-connector-ivy"
DESCRIPTION = "This package provides API documentation for xmvn-connector-ivy."
LICENSE = "Apache-2.0"

PV = "4.0.0~20220623.8da91ea"

RPM_NAME = "xmvn-connector-ivy-javadoc-4.0.0~20220623.8da91ea-1.2.noarch.rpm"
RPM_HASH = "e3735ee5041adfe97ba8b319b2a16ecd49e65a08adaa48151467b0b87e7e780e171a829a87e2067cc8c7774a508541e69f2e84ba528a2f0610fb74ed08cea5dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-connector-ivy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
