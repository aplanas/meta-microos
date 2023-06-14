SUMMARY = "Compatibility Maven project artifact"
DESCRIPTION = "Maven project artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-project-2.2.1-3.8.noarch.rpm"
RPM_HASH = "6e9ade52ddb65e7c47219b62cda635405039d1da758b00dc939baaa6174c4978131bd390d4e3afeb9136c626c4ed238c939a3255dee9f2b98c9b22a6af0bf025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-project \
mvn-org.apache.maven-maven-project \
mvn-org.apache.maven-maven-project-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-artifact-manager \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-registry \
mvn-org.apache.maven-maven-profile \
mvn-org.apache.maven-maven-settings \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
