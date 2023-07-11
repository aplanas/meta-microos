SUMMARY = "Compatibility Maven settings artifact"
DESCRIPTION = "Maven settings artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-settings-2.2.1-3.9.noarch.rpm"
RPM_HASH = "130a6fc1f6a405c10132b9465f621ef182d35ff6a08e72015f238302bcad6f1782bc614d80826b335529dd153acb8b40685c21b87c0bbbff8be69860d1e13530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-settings \
mvn-org.apache.maven-maven-settings-2.0.2 \
mvn-org.apache.maven-maven-settings-2.0.6 \
mvn-org.apache.maven-maven-settings-2.0.7 \
mvn-org.apache.maven-maven-settings-2.0.8 \
mvn-org.apache.maven-maven-settings-2.2.1 \
mvn-org.apache.maven-maven-settings-pom-2.0.2 \
mvn-org.apache.maven-maven-settings-pom-2.0.6 \
mvn-org.apache.maven-maven-settings-pom-2.0.7 \
mvn-org.apache.maven-maven-settings-pom-2.0.8 \
mvn-org.apache.maven-maven-settings-pom-2.2.1"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-model \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
