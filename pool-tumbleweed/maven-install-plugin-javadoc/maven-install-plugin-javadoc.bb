SUMMARY = "Javadoc for maven-install-plugin"
DESCRIPTION = "API documentation for maven-install-plugin."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "maven-install-plugin-javadoc-3.1.1-1.1.noarch.rpm"
RPM_HASH = "1451b0acb4d0d615c68fae897a80519577011206ba9e8c5b2cc445ee520a80851454a2d7937c26ab480bfdaedca421a81d0746fb145ea70855378b6938e32faa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-install-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
