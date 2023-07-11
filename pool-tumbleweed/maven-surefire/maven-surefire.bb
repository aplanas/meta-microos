SUMMARY = "Test framework project"
DESCRIPTION = "Surefire is a test framework project."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-2.22.0-8.2.noarch.rpm"
RPM_HASH = "2354ccd2ea2da89f0ed0c78943d9ee1f8b4bb0ccafc067bf0eec96815c20d999679c870a522a273cb18907d45521c90df3d7876c511ba4b7c8372fe02d66dd48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire \
mvn-org.apache.maven.surefire-common-java5 \
mvn-org.apache.maven.surefire-common-java5-pom- \
mvn-org.apache.maven.surefire-maven-surefire-common \
mvn-org.apache.maven.surefire-maven-surefire-common-pom- \
mvn-org.apache.maven.surefire-surefire-api \
mvn-org.apache.maven.surefire-surefire-api-pom- \
mvn-org.apache.maven.surefire-surefire-booter \
mvn-org.apache.maven.surefire-surefire-booter-pom- \
mvn-org.apache.maven.surefire-surefire-grouper \
mvn-org.apache.maven.surefire-surefire-grouper-pom- \
mvn-org.apache.maven.surefire-surefire-logger-api \
mvn-org.apache.maven.surefire-surefire-logger-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-java \
procps"

inherit rpm
