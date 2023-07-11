SUMMARY = "Tests for maven-scm"
DESCRIPTION = "Tests for maven-scm."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "maven-scm-test-1.12.0-3.4.noarch.rpm"
RPM_HASH = "fe1d3b1e9b99998ec1fe9df76f1bd31bfd5d4ed5b12aec33ce531d0d3e94fb5d2ec56a75fb761814c7e28547af18cb309f083c639ac6cc51912b86979c6736e1"
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
