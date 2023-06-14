SUMMARY = "Compatibility Maven artifact manager artifact"
DESCRIPTION = "Maven artifact manager artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-artifact-manager-2.2.1-3.8.noarch.rpm"
RPM_HASH = "844e23cbf6a438f1d8d53b8471293a131878665cf47691dd4b73ffce3e0f686f3cb2013544b9ae3570581cfe0678af57d9d5b420041b566b262b1a2869be4e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact-manager \
mvn-org.apache.maven-maven-artifact-manager \
mvn-org.apache.maven-maven-artifact-manager-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-repository-metadata \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
