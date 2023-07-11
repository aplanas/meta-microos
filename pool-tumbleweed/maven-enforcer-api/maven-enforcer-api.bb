SUMMARY = "Enforcer API"
DESCRIPTION = "This component provides the generic interfaces needed to \
implement custom rules for the maven-enforcer-plugin."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "maven-enforcer-api-1.4.1-3.11.noarch.rpm"
RPM_HASH = "7ca109c63424e428e16d2d878956918b8ffca5d3cd522f16184528f81a48a8a894db4e6337a46d06810d819f43454904f609fb0fe6f0e587927200a533f7616b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-api \
mvn-org.apache.maven.enforcer-enforcer-api \
mvn-org.apache.maven.enforcer-enforcer-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-container-default"

inherit rpm
