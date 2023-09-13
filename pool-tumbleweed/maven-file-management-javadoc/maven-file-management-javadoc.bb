SUMMARY = "Javadoc for maven-file-management"
DESCRIPTION = "API documentation for maven-file-management."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-file-management-javadoc-3.0.0-4.1.noarch.rpm"
RPM_HASH = "af7b3d542e73436cb943f8dbfbb7b25ab4cc4aceb925dcbaf494bb21cac527e3082fec70194d545e6470544be8b020d48a4a1dfd4897df5ef908c95b24044924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-file-management-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
