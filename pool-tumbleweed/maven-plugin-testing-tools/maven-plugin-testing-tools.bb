SUMMARY = "Maven Plugin Testing Tools"
DESCRIPTION = "A set of useful tools to help the Maven Plugin testing."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-plugin-testing-tools-3.3.0-5.13.noarch.rpm"
RPM_HASH = "72273f87dec7a265a2297a1c35f5024e13fc33ae19c71319b95ec14267f5405850305ef7831a7a67a36a5a67be981dfa1fe4b329f2aab3d976558d251dec4c6e"
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
