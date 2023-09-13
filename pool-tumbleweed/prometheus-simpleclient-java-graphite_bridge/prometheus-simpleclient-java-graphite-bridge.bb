SUMMARY = "Prometheus Java Simpleclient Graphite Bridge"
DESCRIPTION = "Graphite bridge for the Prometheus Java Simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-graphite_bridge-0.8.0-7.1.noarch.rpm"
RPM_HASH = "dfcb4ded050fd0b41926e992dc477f682fea9b1f5fc52a9ce57affc0de17f9f978f839b1261c71c6f871214dd528f103353b869d854b05b4317b87d2736897cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-graphite-bridge \
mvn-io.prometheus-simpleclient-graphite-bridge-pom- \
osgi-io.prometheus.simpleclient-graphite-bridge \
prometheus-simpleclient-java-graphite-bridge"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient"

inherit rpm
