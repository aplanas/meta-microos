SUMMARY = "Compatibility Maven artifact artifact"
DESCRIPTION = "Maven artifact manager artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-artifact-2.2.1-3.9.noarch.rpm"
RPM_HASH = "0d4ef920a274b6749033a9ecb9c7f0e37023c92705c26042af675d04b51e1fc8209892858121d435eb34028834a1f694e00221ac96a870729fe779cda99ecbef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact \
mvn-org.apache.maven-maven-artifact-2.0.2 \
mvn-org.apache.maven-maven-artifact-2.0.6 \
mvn-org.apache.maven-maven-artifact-2.0.7 \
mvn-org.apache.maven-maven-artifact-2.0.8 \
mvn-org.apache.maven-maven-artifact-2.2.1 \
mvn-org.apache.maven-maven-artifact-pom-2.0.2 \
mvn-org.apache.maven-maven-artifact-pom-2.0.6 \
mvn-org.apache.maven-maven-artifact-pom-2.0.7 \
mvn-org.apache.maven-maven-artifact-pom-2.0.8 \
mvn-org.apache.maven-maven-artifact-pom-2.2.1"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
