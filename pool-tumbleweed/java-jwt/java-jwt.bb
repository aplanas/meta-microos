SUMMARY = "Java JWT"
DESCRIPTION = "Java implementation of JSON Web Token (JWT)"
LICENSE = "MIT"

PV = "3.8.3"

RPM_NAME = "java-jwt-3.8.3-1.18.noarch.rpm"
RPM_HASH = "ba5e80d183520e64a66b51d9707e0c6e250dc483a166c1187e5e7a8bc73c2269a6c69f692726b3507687eb8ad3c6c3d157f21ddeb77aa5c3a1612475343c05a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-jwt \
mvn(com.auth0:java-jwt) \
mvn(com.auth0:java-jwt:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-databind) \
mvn(commons-codec:commons-codec)"

inherit rpm
