SUMMARY = "Maven Incremental Build support utilities"
DESCRIPTION = "Various utility classes and plexus components for supporting \
incremental build functionality in maven plugins."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "maven-shared-incremental-1.1-2.12.noarch.rpm"
RPM_HASH = "80c4a31b3ea6ab1d3891eeaed1e04d93749c1ee1661363d1f630a04055b70d505391a6cf5edafcb339bcab06dd829f917f0fea596d4a42ff5499223753670d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-incremental \
mvn(org.apache.maven.shared:maven-shared-incremental) \
mvn(org.apache.maven.shared:maven-shared-incremental:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.shared:maven-shared-utils) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-component-annotations)"

inherit rpm
