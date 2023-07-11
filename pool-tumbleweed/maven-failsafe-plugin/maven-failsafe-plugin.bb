SUMMARY = "Maven plugin for running integration tests"
DESCRIPTION = "The Failsafe Plugin is designed to run integration tests while the \
Surefire Plugins is designed to run unit. The name (failsafe) was \
chosen both because it is a synonym of surefire and because it implies \
that when it fails, it does so in a safe way. \
 \
If you use the Surefire Plugin for running tests, then when you have a \
test failure, the build will stop at the integration-test phase and \
your integration test environment will not have been torn down \
correctly. \
 \
The Failsafe Plugin is used during the integration-test and verify \
phases of the build lifecycle to execute the integration tests of an \
application. The Failsafe Plugin will not fail the build during the \
integration-test phase thus enabling the post-integration-test phase \
to execute."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-failsafe-plugin-2.22.0-8.2.noarch.rpm"
RPM_HASH = "3437e638bab27a06fa95ee572cbd93caa8afea4865d347ab9bb4d57519f7730bb354f761fd82c2843341c5b3cf71761475c346038a3c9ff815bba2f66281e0fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-failsafe-plugin \
mvn-org.apache.maven.plugins-maven-failsafe-plugin \
mvn-org.apache.maven.plugins-maven-failsafe-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.surefire-maven-surefire-common"

inherit rpm
