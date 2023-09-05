SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: JavaMail API"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-javamail-1_3_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "b6e3062154e56d8347ba193caaced4b5cda03cb5dc6cfaee43e9354fb3186daac278f903c4ec975295d868ca7ffb20c5d66cca893dcc59d8c8943b05cffe3776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-javamail-1-3-1-api \
javamail-1-3-1-api \
javamail-api \
mvn-org.apache.geronimo.specs-geronimo-javamail-1.3.1-spec \
mvn-org.apache.geronimo.specs-geronimo-javamail-1.3.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
jaf-1-0-2-api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
