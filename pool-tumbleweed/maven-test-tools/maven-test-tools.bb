SUMMARY = "Maven Testing Tool"
DESCRIPTION = "Framework to test Maven Plugins with Easymock objects."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-test-tools-3.3.0-5.12.noarch.rpm"
RPM_HASH = "c4e79dd9e9e3333d60ce5f92451f1ea25a6d40595dd1b5e42202ae49caf4c9dbdd60a1db0910e812d026fd3e2bfcf9af261d11455992582554a1e7db257d35df"
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
