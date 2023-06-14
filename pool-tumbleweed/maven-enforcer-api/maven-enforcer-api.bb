SUMMARY = "Enforcer API"
DESCRIPTION = "This component provides the generic interfaces needed to \
implement custom rules for the maven-enforcer-plugin."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "maven-enforcer-api-1.4.1-3.10.noarch.rpm"
RPM_HASH = "636b7c202f14ebfa59f36c6d3a6069f86b6957e6b4bd37d567f888a866d732863377108d62d4732b9754ea8321d83b39663981d9876f2b15cfa81d7325ab93a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-api \
mvn-org.apache.maven.enforcer-enforcer-api \
mvn-org.apache.maven.enforcer-enforcer-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-container-default"

inherit rpm
