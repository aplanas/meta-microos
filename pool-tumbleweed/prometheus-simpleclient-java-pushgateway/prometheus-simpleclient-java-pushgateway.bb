SUMMARY = "Prometheus Java Simpleclient Pushgateway"
DESCRIPTION = "Pushgateway exporter for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-pushgateway-0.8.0-7.1.noarch.rpm"
RPM_HASH = "7bb4aa0f42600772cab6af743665270051c5b29508e19de90f5c517bb80357f2d185bf4a37dc2d9fcdbd84d5db9bc6117b363a4d62f04382045cc5469e1f42f3"
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
