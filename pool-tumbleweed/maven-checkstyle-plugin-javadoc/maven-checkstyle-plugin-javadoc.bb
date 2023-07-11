SUMMARY = "Javadoc for maven-checkstyle-plugin"
DESCRIPTION = "This package contains the API documentation for maven-checkstyle-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-checkstyle-plugin-javadoc-3.0.0-1.21.noarch.rpm"
RPM_HASH = "9992617aaa7c737abf40db6f9f161976fa7aa95f91d967b16c808c3da4c8e5a52cf2391e0d668ffcdba15cd51a71ce3e647d0ed94340ae2153e1469ceb5a4c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-checkstyle-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
