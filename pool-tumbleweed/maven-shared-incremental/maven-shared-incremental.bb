SUMMARY = "Maven Incremental Build support utilities"
DESCRIPTION = "Various utility classes and plexus components for supporting \
incremental build functionality in maven plugins."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "maven-shared-incremental-1.1-2.13.noarch.rpm"
RPM_HASH = "5a7eb833b32a19809e37eca5565dc71c7e70ba028ca8ec0e80d102f7e31bce144ef25c6fe72004344f4d8eb571a147e878f6d9c7601e62b3f8033b6b8b0c7cdd"
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
