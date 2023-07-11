SUMMARY = "Test harness for Maven integration tests"
DESCRIPTION = "Provides a test harness for Maven integration tests."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "maven-verifier-1.6-3.13.noarch.rpm"
RPM_HASH = "71a5e42df55cf2c277ecee074b54baf89b11192f41820f25c793d8690e47cd1f304e59109fac15a72b6776fb35ed709e6c546898b1910e1f11b30ad5d0783fee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-verifier \
mvn-org.apache.maven.shared-maven-verifier \
mvn-org.apache.maven.shared-maven-verifier-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-junit-junit \
mvn-org.apache.maven.shared-maven-shared-utils"

inherit rpm
