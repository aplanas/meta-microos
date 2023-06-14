SUMMARY = "Maven Plugin Testing Tools"
DESCRIPTION = "A set of useful tools to help the Maven Plugin testing."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-plugin-testing-tools-3.3.0-5.12.noarch.rpm"
RPM_HASH = "80122e9671097ac87dfabef92231b1d770f9cea2453730456f0056392cf1fa677137dff3fcf25542464c76ed798439d928633939d152c91dd7b7d562b4e6cc97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-testing-tools \
mvn-org.apache.maven.plugin-testing-maven-plugin-testing-tools \
mvn-org.apache.maven.plugin-testing-maven-plugin-testing-tools-pom- \
mvn-org.apache.maven.shared-maven-plugin-testing-tools \
mvn-org.apache.maven.shared-maven-plugin-testing-tools-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.shared-maven-invoker"

inherit rpm
