SUMMARY = "Enforcer Rules"
DESCRIPTION = "This component contains the standard Enforcer Rules."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "maven-enforcer-plugin-1.4.1-3.11.noarch.rpm"
RPM_HASH = "20b7a56edbf8a5eb5021d3f5c46666b1c5e754f5ea494873aff52797d79bb205e70de3b782557d4d8c980f670e5fdd52afe369ee6f4b5e69e09554a11a5422d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-plugin \
mvn-org.apache.maven.plugins-maven-enforcer-plugin \
mvn-org.apache.maven.plugins-maven-enforcer-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-lang-commons-lang \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.enforcer-enforcer-api \
mvn-org.apache.maven.enforcer-enforcer-rules \
mvn-org.apache.maven.plugin-testing-maven-plugin-testing-harness \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
