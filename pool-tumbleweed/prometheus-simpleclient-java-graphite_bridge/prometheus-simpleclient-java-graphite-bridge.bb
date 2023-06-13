SUMMARY = "Prometheus Java Simpleclient Graphite Bridge"
DESCRIPTION = "Graphite bridge for the Prometheus Java Simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-graphite_bridge-0.8.0-6.10.noarch.rpm"
RPM_HASH = "cd19ed35e54763b83f9afc80cbe39327d9b0ea52157580488e64910556b240d94dcdc18c7a39537c8e8ce5f9d965bb81ef5f5185625a99a92a671a98aaef5a4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.prometheus:simpleclient_graphite_bridge) \
mvn(io.prometheus:simpleclient_graphite_bridge:pom:) \
osgi(io.prometheus.simpleclient_graphite_bridge) \
prometheus-simpleclient-java-graphite_bridge"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(io.prometheus:simpleclient)"

inherit rpm
