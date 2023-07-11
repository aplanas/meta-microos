SUMMARY = "TestNG provider for Maven Surefire"
DESCRIPTION = "TestNG provider for Maven Surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-provider-testng-2.22.0-8.2.noarch.rpm"
RPM_HASH = "0a4c8836a43a02fc0b821d020988b8b5b2580da4f937fa302a9083b38bce34ee2c087ee57f144fd9a3dededa5bbcd4c31d7df17423fbb11f04777526ab70ffe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-provider-testng \
mvn-org.apache.maven.surefire-surefire-testng \
mvn-org.apache.maven.surefire-surefire-testng-pom- \
mvn-org.apache.maven.surefire-surefire-testng-utils \
mvn-org.apache.maven.surefire-surefire-testng-utils-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.surefire-common-java5 \
mvn-org.apache.maven.surefire-surefire-api \
mvn-org.apache.maven.surefire-surefire-grouper"

inherit rpm
