SUMMARY = "Docker Client"
DESCRIPTION = "The Docker Client is a Java API library for accessing a Docker daemon."
LICENSE = "Apache-2.0"

PV = "8.11.7"

RPM_NAME = "docker-client-java-8.11.7-3.11.noarch.rpm"
RPM_HASH = "9ea2877024e169e788c42f09a6a72d50346e570747c93e81541e21535045ef31c9020dd3c9ca55f48b0241e6b90c8b2ce6ec5837d31e5a2a7858d1304e04d1f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-client-java \
mvn-com.spotify-docker-client \
mvn-com.spotify-docker-client-pom- \
osgi-com.spotify.docker.client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-guava \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-json-provider \
mvn-com.github.jnr-jnr-unixsocket \
mvn-com.google.auto.value-auto-value-annotations \
mvn-com.google.guava-guava \
mvn-commons-io-commons-io \
mvn-commons-lang-commons-lang \
mvn-org.apache.commons-commons-compress \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.bouncycastle-bcpkix-jdk15on \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.jersey.connectors-jersey-apache-connector \
mvn-org.glassfish.jersey.core-jersey-client \
mvn-org.glassfish.jersey.media-jersey-media-json-jackson \
mvn-org.slf4j-slf4j-api"

inherit rpm
