SUMMARY = "JSR 353 (JSON Processing) RI"
DESCRIPTION = "JSR 353: Java API for Processing JSON RI."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.4"

RPM_NAME = "jsonp-1.0.4-3.11.noarch.rpm"
RPM_HASH = "940bfe2f02004680e1974974071d3a4d5fff917ab2c1a662749209cad0cb951b0754304c1ec94d75bcb7059a15de49e00cb8a1648e34d6b385a17cbb22a88744"
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
