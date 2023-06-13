SUMMARY = "Javadoc for maven-doxia-sitetools"
DESCRIPTION = "API documentation for maven-doxia-sitetools."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "maven-doxia-sitetools-javadoc-1.9.2-4.8.noarch.rpm"
RPM_HASH = "d47d14cfc976b36bbbcbf5b8bf5312b9c7cd6cbfa6325dcc290e65549bb38553fca55c693bfc043ad9b129ec86f07a4ad8226a608c50e799466d38f01c5b0a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-sitetools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
