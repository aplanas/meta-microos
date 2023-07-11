SUMMARY = "Java JWT"
DESCRIPTION = "Java implementation of JSON Web Token (JWT)"
LICENSE = "MIT"

PV = "3.8.3"

RPM_NAME = "java-jwt-3.8.3-1.19.noarch.rpm"
RPM_HASH = "2907f5cc0ff4c96681a18518b9d10255db568d3446b2cfe43e121b7018bd684df27937affefc4e901b5851f56956ec5a8f40e1b71ade4117fc650690eece9774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-jwt \
mvn-com.auth0-java-jwt \
mvn-com.auth0-java-jwt-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-commons-codec-commons-codec"

inherit rpm
