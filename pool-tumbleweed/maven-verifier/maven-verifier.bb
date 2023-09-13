SUMMARY = "Test harness for Maven integration tests"
DESCRIPTION = "Provides a test harness for Maven integration tests."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "maven-verifier-1.6-4.1.noarch.rpm"
RPM_HASH = "844d866d3eb11ac98a242f3e56b0ce277a9741bce4a2f9d64571ef3e8a19817461c4c4941ac02ab95623d93e9f247f779a4a1b8bc3a4a69b7ebd11f808dfe01d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-verifier \
mvn-org.apache.maven.shared-maven-verifier \
mvn-org.apache.maven.shared-maven-verifier-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-junit-junit \
mvn-org.apache.maven.shared-maven-shared-utils"

inherit rpm
