SUMMARY = "Javadoc for maven-file-management"
DESCRIPTION = "API documentation for maven-file-management."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-file-management-javadoc-3.0.0-3.9.noarch.rpm"
RPM_HASH = "c515cff447e3209ebd63d749f206322ada17a95b6ca185e1f75f1f8b5f6f35e75277f1c7a14f09382500459b0f8d1f4f5c91b4b03069a9a792c6fdad49491180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-file-management-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
