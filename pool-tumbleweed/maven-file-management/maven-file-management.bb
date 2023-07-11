SUMMARY = "Maven File Management API"
DESCRIPTION = "Provides a component for plugins to easily resolve project dependencies."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-file-management-3.0.0-3.9.noarch.rpm"
RPM_HASH = "0ac2b93fd14bb43586786d04144cd04db1f7b6936c2e1732d45e25d4ef6b1e2238d9fca6d86c7fb2e34fdb32bf0aa8548639e9d2337a4c0591ed23dd3783242f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-file-management \
mvn-org.apache.maven.shared-file-management \
mvn-org.apache.maven.shared-file-management-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-shared-io \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
