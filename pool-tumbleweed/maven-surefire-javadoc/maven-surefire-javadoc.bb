SUMMARY = "Javadoc for maven-surefire"
DESCRIPTION = "Javadoc for maven-surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-javadoc-2.22.0-8.1.noarch.rpm"
RPM_HASH = "3e638fdfa77e74168d27c8e2d4cfffd7d6552ff726f3667f7c81ed52c9d4b722e0dd1fec497edec4abdb8f9f27082ae4acced90b8e305f2594c714e78f2b68a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
