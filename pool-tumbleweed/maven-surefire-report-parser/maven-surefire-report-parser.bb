SUMMARY = "Parses report output files from surefire"
DESCRIPTION = "Plugin for parsing report output files from surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-report-parser-2.22.0-8.2.noarch.rpm"
RPM_HASH = "0046dfaf5b4f854558a334e7ff2a07285f013e6e7680b1dac49dfc2a1acfcf6874673e40126e9b3fbd2e78872b7b9382fc10e7de087c5c5b338c353f27ff169b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-report-parser \
mvn-org.apache.maven.surefire-surefire-report-parser \
mvn-org.apache.maven.surefire-surefire-report-parser-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.surefire-surefire-logger-api"

inherit rpm
