SUMMARY = "Java regression testing framework"
DESCRIPTION = "JUnit is a popular regression testing framework for Java platform."
LICENSE = "EPL-2.0"

PV = "5.8.2"

RPM_NAME = "junit5-5.8.2-1.10.noarch.rpm"
RPM_HASH = "6515523f5ba26d408ac275031cbb493c7bd50e16c9a6f392649113230b3aca9c23f14882c727ac12824854c08db536d0c251a63b1619e6a147da6ee6e995e7a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5 \
mvn-org.junit.jupiter-junit-jupiter \
mvn-org.junit.jupiter-junit-jupiter-api \
mvn-org.junit.jupiter-junit-jupiter-api-pom- \
mvn-org.junit.jupiter-junit-jupiter-engine \
mvn-org.junit.jupiter-junit-jupiter-engine-pom- \
mvn-org.junit.jupiter-junit-jupiter-migrationsupport \
mvn-org.junit.jupiter-junit-jupiter-migrationsupport-pom- \
mvn-org.junit.jupiter-junit-jupiter-params \
mvn-org.junit.jupiter-junit-jupiter-params-pom- \
mvn-org.junit.jupiter-junit-jupiter-pom- \
mvn-org.junit.platform-junit-platform-commons \
mvn-org.junit.platform-junit-platform-commons-pom- \
mvn-org.junit.platform-junit-platform-console \
mvn-org.junit.platform-junit-platform-console-pom- \
mvn-org.junit.platform-junit-platform-console-standalone \
mvn-org.junit.platform-junit-platform-console-standalone-pom- \
mvn-org.junit.platform-junit-platform-engine \
mvn-org.junit.platform-junit-platform-engine-pom- \
mvn-org.junit.platform-junit-platform-launcher \
mvn-org.junit.platform-junit-platform-launcher-pom- \
mvn-org.junit.platform-junit-platform-reporting \
mvn-org.junit.platform-junit-platform-reporting-pom- \
mvn-org.junit.platform-junit-platform-runner \
mvn-org.junit.platform-junit-platform-runner-pom- \
mvn-org.junit.platform-junit-platform-suite-api \
mvn-org.junit.platform-junit-platform-suite-api-pom- \
mvn-org.junit.platform-junit-platform-suite-commons \
mvn-org.junit.platform-junit-platform-suite-commons-pom- \
mvn-org.junit.vintage-junit-vintage-engine \
mvn-org.junit.vintage-junit-vintage-engine-pom- \
osgi-org.junit.jupiter \
osgi-org.junit.jupiter.api \
osgi-org.junit.jupiter.engine \
osgi-org.junit.jupiter.migrationsupport \
osgi-org.junit.jupiter.params \
osgi-org.junit.platform.commons \
osgi-org.junit.platform.console \
osgi-org.junit.platform.console.standalone \
osgi-org.junit.platform.engine \
osgi-org.junit.platform.launcher \
osgi-org.junit.platform.reporting \
osgi-org.junit.platform.runner \
osgi-org.junit.platform.suite.api \
osgi-org.junit.platform.suite.commons \
osgi-org.junit.vintage.engine"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.univocity-univocity-parsers \
mvn-info.picocli-picocli \
mvn-junit-junit \
mvn-org.opentest4j-opentest4j"

inherit rpm
