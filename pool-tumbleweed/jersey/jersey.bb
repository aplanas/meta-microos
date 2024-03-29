SUMMARY = "JAX-RS (JSR 311) production quality Reference Implementation"
DESCRIPTION = "Jersey is the open source JAX-RS (JSR 311) \
production quality Reference Implementation \
for building RESTful Web services."
LICENSE = "Apache-2.0 & (EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.28"

RPM_NAME = "jersey-2.28-6.11.noarch.rpm"
RPM_HASH = "3e68220b07814ae0a6a186a7cc032f3aabc97f4119417e9683e3f3ade864a62b828a41da56408a94e5eedc52d6e363a89721f17fdbd21dc083a37a0313ef3b08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jersey \
mvn-org.glassfish.jersey-jersey-bom-pom- \
mvn-org.glassfish.jersey-project-pom- \
mvn-org.glassfish.jersey.connectors-jersey-apache-connector \
mvn-org.glassfish.jersey.connectors-jersey-apache-connector-pom- \
mvn-org.glassfish.jersey.connectors-jersey-jdk-connector \
mvn-org.glassfish.jersey.connectors-jersey-jdk-connector-pom- \
mvn-org.glassfish.jersey.connectors-jersey-jetty-connector \
mvn-org.glassfish.jersey.connectors-jersey-jetty-connector-pom- \
mvn-org.glassfish.jersey.connectors-project-pom- \
mvn-org.glassfish.jersey.core-jersey-client \
mvn-org.glassfish.jersey.core-jersey-client-pom- \
mvn-org.glassfish.jersey.core-jersey-common \
mvn-org.glassfish.jersey.core-jersey-common-pom- \
mvn-org.glassfish.jersey.core-jersey-server \
mvn-org.glassfish.jersey.core-jersey-server-pom- \
mvn-org.glassfish.jersey.ext-jersey-entity-filtering \
mvn-org.glassfish.jersey.ext-jersey-entity-filtering-pom- \
mvn-org.glassfish.jersey.ext-project-pom- \
mvn-org.glassfish.jersey.inject-jersey-hk2 \
mvn-org.glassfish.jersey.inject-jersey-hk2-pom- \
mvn-org.glassfish.jersey.inject-project-pom- \
mvn-org.glassfish.jersey.media-jersey-media-jaxb \
mvn-org.glassfish.jersey.media-jersey-media-jaxb-pom- \
mvn-org.glassfish.jersey.media-jersey-media-json-jackson \
mvn-org.glassfish.jersey.media-jersey-media-json-jackson-pom- \
mvn-org.glassfish.jersey.media-project-pom- \
osgi-org.glassfish.jersey.connectors.jersey-apache-connector \
osgi-org.glassfish.jersey.connectors.jersey-jdk-connector \
osgi-org.glassfish.jersey.core.jersey-client \
osgi-org.glassfish.jersey.core.jersey-common \
osgi-org.glassfish.jersey.core.jersey-server \
osgi-org.glassfish.jersey.ext.jersey-entity-filtering \
osgi-org.glassfish.jersey.inject.jersey-hk2 \
osgi-org.glassfish.jersey.media.jersey-media-jaxb \
osgi-org.glassfish.jersey.media.jersey-media-json-jackson"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations \
mvn-com.google.guava-guava \
mvn-jakarta.ws.rs-jakarta.ws.rs-api \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject \
mvn-javax.validation-validation-api \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.glassfish.hk2-osgi-resource-locator \
mvn-org.ow2.asm-asm"

inherit rpm
