SUMMARY = "Prometheus Java Simpleclient Pushgateway"
DESCRIPTION = "Pushgateway exporter for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-pushgateway-0.8.0-6.11.noarch.rpm"
RPM_HASH = "ce02a2c77c15eee208d9cec94365ecfdfbf976205b76e9bb6940103dc4fbeb100dd6fd462d2808ccab21083cde123010b2f7bc2775fdeadb13a7a80945efe502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-pushgateway \
mvn-io.prometheus-simpleclient-pushgateway-pom- \
osgi-io.prometheus.simpleclient-pushgateway \
prometheus-simpleclient-java-pushgateway"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-common"

inherit rpm
