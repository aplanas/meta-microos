SUMMARY = "Prometheus Java Simpleclient Graphite Bridge"
DESCRIPTION = "Graphite bridge for the Prometheus Java Simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-graphite_bridge-0.8.0-6.11.noarch.rpm"
RPM_HASH = "6d868415f72966d66c0f982eab1aa7f2d3431b756b4bfc1606ccece3ca3b1a3f9b0ab1d38072f09d4fe155a1eb4b5ba4da300026860f5b0423c0da0d58a4062e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-graphite-bridge \
mvn-io.prometheus-simpleclient-graphite-bridge-pom- \
osgi-io.prometheus.simpleclient-graphite-bridge \
prometheus-simpleclient-java-graphite-bridge"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient"

inherit rpm
