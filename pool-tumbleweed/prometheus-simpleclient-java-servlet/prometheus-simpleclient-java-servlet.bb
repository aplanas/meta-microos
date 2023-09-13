SUMMARY = "Prometheus Java Simpleclient Servlet"
DESCRIPTION = "HTTP servlet exporter for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-servlet-0.8.0-7.1.noarch.rpm"
RPM_HASH = "1b2403283332023c90389094fe23d5dcb3f1654e709374e408c0c31f0b51f7210823b9849cf6a5b74d1638fa3601c637e89c2523140a3c3179f763c79f260d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-servlet \
mvn-io.prometheus-simpleclient-servlet-pom- \
osgi-io.prometheus.simpleclient-servlet \
prometheus-simpleclient-java-servlet"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-common"

inherit rpm
