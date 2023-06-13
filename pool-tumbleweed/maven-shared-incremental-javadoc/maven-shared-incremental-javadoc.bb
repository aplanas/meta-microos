SUMMARY = "API documentation for maven-shared-incremental"
DESCRIPTION = "This package provides API documentation for maven-shared-incremental."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "maven-shared-incremental-javadoc-1.1-2.12.noarch.rpm"
RPM_HASH = "02147a76df992a809ba531b27e083982845c35d725e37054e50817a56e6859e49cf0d49fac8e3dec5596dc886824af55387f4f05258cfb1041ca1498f5915828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-incremental-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
