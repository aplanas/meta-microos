SUMMARY = "Tests for maven-scm"
DESCRIPTION = "Tests for maven-scm."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "maven-scm-test-1.12.0-4.1.noarch.rpm"
RPM_HASH = "4855af4f2499e29f8b8387538434ecf516527a066f7aacd79273c94ad056069c23aa5e5382ad042c98de0e84d0fa68436422031b054e13bdd3cc77935f2c1af1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-scm-test \
mvn-org.apache.maven.scm-maven-scm-provider-cvstest \
mvn-org.apache.maven.scm-maven-scm-provider-cvstest-pom- \
mvn-org.apache.maven.scm-maven-scm-provider-gittest \
mvn-org.apache.maven.scm-maven-scm-provider-gittest-pom- \
mvn-org.apache.maven.scm-maven-scm-provider-svntest \
mvn-org.apache.maven.scm-maven-scm-provider-svntest-pom- \
mvn-org.apache.maven.scm-maven-scm-test \
mvn-org.apache.maven.scm-maven-scm-test-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
maven-scm \
mvn-junit-junit \
mvn-org.apache.maven.scm-maven-scm-api \
mvn-org.apache.maven.scm-maven-scm-manager-plexus \
mvn-org.apache.maven.scm-maven-scm-provider-git-commons \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.sonatype.plexus-plexus-sec-dispatcher"

inherit rpm
