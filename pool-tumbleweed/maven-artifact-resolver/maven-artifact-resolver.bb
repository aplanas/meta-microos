SUMMARY = "Maven Artifact Resolution API"
DESCRIPTION = "Provides a component for plugins to easily resolve project dependencies."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "maven-artifact-resolver-1.0-3.11.noarch.rpm"
RPM_HASH = "a4116dd3d5643e73bee0e18682c0296f5411b5ff3e586a52e2960b1bc7e91b2f52a6eafccc0a643c26875328d9691fd9e648426e19850cdb603c32f349c23d33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact-resolver \
mvn-org.apache.maven.shared-maven-artifact-resolver \
mvn-org.apache.maven.shared-maven-artifact-resolver-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-compat"

inherit rpm
