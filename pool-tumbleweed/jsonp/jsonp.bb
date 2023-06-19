SUMMARY = "JSR 353 (JSON Processing) RI"
DESCRIPTION = "JSR 353: Java API for Processing JSON RI."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.4"

RPM_NAME = "jsonp-1.0.4-3.10.noarch.rpm"
RPM_HASH = "906fc6e773b40fe3b4b762f7c36adac134c21c2904715882facdc6be5a8fe26bf2cfe55b7ff74604bee91706b4c30009fb991f6a877cf2034101a468f0dc881e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsonp \
mvn-javax.json-javax.json-api \
mvn-javax.json-javax.json-api-pom- \
mvn-org.glassfish-javax.json \
mvn-org.glassfish-javax.json-pom- \
mvn-org.glassfish-json-pom- \
mvn-org.glassfish-jsonp-jaxrs \
mvn-org.glassfish-jsonp-jaxrs-pom- \
osgi-jakarta.json-api \
osgi-org.glassfish.javax.json \
osgi-org.glassfish.jsonp-jaxrs"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
