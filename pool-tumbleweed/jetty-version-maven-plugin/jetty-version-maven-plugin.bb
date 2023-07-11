SUMMARY = "Jetty version management Maven plugin"
DESCRIPTION = "Jetty version management Maven plugin"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.0.10"

RPM_NAME = "jetty-version-maven-plugin-1.0.10-2.10.noarch.rpm"
RPM_HASH = "b8c5c859ee12f25846550e3891f2ff39a274fb470b0c9473e6e7474724c9fb8417be34009ac49836ac74127f6a512637f2402d6d025bcc4e09586ae0561a2cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-version-maven-plugin \
mvn-org.eclipse.jetty.toolchain-jetty-version-maven-plugin \
mvn-org.eclipse.jetty.toolchain-jetty-version-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-project"

inherit rpm
