SUMMARY = "JUnit 5 provider for Maven Surefire"
DESCRIPTION = "JUnit 5 provider for Maven Surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-provider-junit5-2.22.0-8.1.noarch.rpm"
RPM_HASH = "8a9cc7e12460f5165ccdfeb80cda8b6397c7e80fe59b08c13d9c333151fa69cb4a6506e76742d0908634171c85c4bee2376f9b98fc195edfc26fd7a9b23e0620"
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
