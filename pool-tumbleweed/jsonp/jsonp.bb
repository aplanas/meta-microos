SUMMARY = "JSR 353 (JSON Processing) RI"
DESCRIPTION = "JSR 353: Java API for Processing JSON RI."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.4"

RPM_NAME = "jsonp-1.0.4-4.1.noarch.rpm"
RPM_HASH = "97d83bd91b2d303a76da806f4252afe27def10f553c8dfb5c700066c2c777cb4a24d65f827fdff35384d37aa283349d8492808fe29cf0ba497b4e3ee94fd08be"
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
