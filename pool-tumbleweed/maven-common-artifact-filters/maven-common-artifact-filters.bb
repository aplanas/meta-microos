SUMMARY = "Maven Common Artifact Filters"
DESCRIPTION = "A collection of ready-made filters to control inclusion/exclusion of artifacts \
during dependency resolution."
LICENSE = "Apache-2.0"

PV = "3.3.2"

RPM_NAME = "maven-common-artifact-filters-3.3.2-2.1.noarch.rpm"
RPM_HASH = "4ec22ce932c10227a7d9724bd9651192c07ae703594316315cca5d5ba37edb55e2e2a556dfbb56140b03a4d66244127040ed0ec8f97efd63f27a8c4733a839d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-common-artifact-filters-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
