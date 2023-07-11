SUMMARY = "Maven Common Artifact Filters"
DESCRIPTION = "A collection of ready-made filters to control inclusion/exclusion of artifacts \
during dependency resolution."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-common-artifact-filters-3.0.1-2.13.noarch.rpm"
RPM_HASH = "2965e17774e555fe59dac25d6c2349639efc966ad785b21ce64287bb6c1221950cdeadc16ece909cd41c23cdd249deeca2964d596ccd6c425c062305ef069a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-common-artifact-filters-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-shared-utils"

inherit rpm
