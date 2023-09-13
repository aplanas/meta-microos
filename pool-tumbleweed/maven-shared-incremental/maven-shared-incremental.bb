SUMMARY = "Maven Incremental Build support utilities"
DESCRIPTION = "Various utility classes and plexus components for supporting \
incremental build functionality in maven plugins."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "maven-shared-incremental-1.1-3.1.noarch.rpm"
RPM_HASH = "d94502807b6e681d94df2366996251a45721b0fd2e2476c188abcb5b5ef50205e8ad1a4564929552b0585205bcebb136e84db3146653a7e3c5820edee633d0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-incremental \
mvn-org.apache.maven.shared-maven-shared-incremental \
mvn-org.apache.maven.shared-maven-shared-incremental-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-component-annotations"

inherit rpm
