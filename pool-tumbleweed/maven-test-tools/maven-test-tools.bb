SUMMARY = "Maven Testing Tool"
DESCRIPTION = "Framework to test Maven Plugins with Easymock objects."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-test-tools-3.3.0-5.13.noarch.rpm"
RPM_HASH = "57e56e3903b4dd4cbd765b9a7d87569b08a0d713ab07271c5a1b7caa49a78743764e65cfe3b59d3c1d8a2a9bd81f49a1f77fa9a1e45fc5ed7a7ff0e24dbbbdbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-test-tools \
mvn-org.apache.maven.plugin-testing-maven-test-tools \
mvn-org.apache.maven.plugin-testing-maven-test-tools-pom- \
mvn-org.apache.maven.shared-maven-test-tools \
mvn-org.apache.maven.shared-maven-test-tools-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.easymock-easymock"

inherit rpm
