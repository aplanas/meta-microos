SUMMARY = "Parses report output files from surefire"
DESCRIPTION = "Plugin for parsing report output files from surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-report-parser-2.22.0-8.1.noarch.rpm"
RPM_HASH = "495f1e127929d7b52004ea2f4a1d73a47b32494230bc428894a0c31e004da3bc56421c8b118528ba2f56c7e2038b502a51bc20b64fa3e46d8064f9389927c6e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-report-parser \
mvn(org.apache.maven.surefire:surefire-report-parser) \
mvn(org.apache.maven.surefire:surefire-report-parser:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.reporting:maven-reporting-api) \
mvn(org.apache.maven.shared:maven-shared-utils) \
mvn(org.apache.maven.surefire:surefire-logger-api)"

inherit rpm
