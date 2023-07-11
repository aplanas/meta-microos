SUMMARY = "Compatibility Maven artifact manager artifact"
DESCRIPTION = "Maven artifact manager artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-artifact-manager-2.2.1-3.9.noarch.rpm"
RPM_HASH = "b45d00e510408ef84322e62dfd057bc1d5521bbf2baa09f31be106e9a36d0e9bf9ddde253165286abbcfddab3d7b54826ac8772dea8b41236ea2261f57eb3f57"
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
