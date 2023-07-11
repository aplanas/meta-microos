SUMMARY = "JUnit provider for Maven Surefire"
DESCRIPTION = "JUnit provider for Maven Surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-provider-junit-2.22.0-8.2.noarch.rpm"
RPM_HASH = "efdf13fa2b7792cbf215ff31047e38e7638396fb5e709a764c55f6797438356c3d4a36654118a6b9eddcf179f80cf1d8822a67523a9748087e00882b7f96f152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-provider-junit \
mvn-org.apache.maven.surefire-common-junit3 \
mvn-org.apache.maven.surefire-common-junit3-pom- \
mvn-org.apache.maven.surefire-common-junit4 \
mvn-org.apache.maven.surefire-common-junit4-pom- \
mvn-org.apache.maven.surefire-common-junit48 \
mvn-org.apache.maven.surefire-common-junit48-pom- \
mvn-org.apache.maven.surefire-surefire-junit3 \
mvn-org.apache.maven.surefire-surefire-junit3-pom- \
mvn-org.apache.maven.surefire-surefire-junit4 \
mvn-org.apache.maven.surefire-surefire-junit4-pom- \
mvn-org.apache.maven.surefire-surefire-junit47 \
mvn-org.apache.maven.surefire-surefire-junit47-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.surefire-common-java5 \
mvn-org.apache.maven.surefire-surefire-api \
mvn-org.apache.maven.surefire-surefire-grouper"

inherit rpm
