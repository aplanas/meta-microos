SUMMARY = "JUnit 5 provider for Maven Surefire"
DESCRIPTION = "JUnit 5 provider for Maven Surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-provider-junit5-2.22.0-8.2.noarch.rpm"
RPM_HASH = "c2e7b3287480abc6c27e1c1316c19fa07044f7a3b04c816ce262ae47968e55928f78b0a09f0519094dd7ba897ad2160e3dc2bffce6747b6448b73d6138d2bcfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-provider-junit5 \
mvn-org.apache.maven.surefire-surefire-junit-platform \
mvn-org.apache.maven.surefire-surefire-junit-platform-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.surefire-common-java5 \
mvn-org.apache.maven.surefire-surefire-api \
mvn-org.junit.platform-junit-platform-launcher \
procps"

inherit rpm
