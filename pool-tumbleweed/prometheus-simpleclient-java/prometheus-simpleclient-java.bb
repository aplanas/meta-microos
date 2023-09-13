SUMMARY = "Prometheus Java Suite"
DESCRIPTION = "The Prometheus Java Suite: Client Metrics, Exposition, and Examples."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-0.8.0-7.1.noarch.rpm"
RPM_HASH = "791097b51e1bf4e0065aa5bc9919b6fc3388af19bec999f67fc4269f0dc44dd5b4fd7198fbd11a6fb2267e708cc805aba157259f070d752a7785973e15a60b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-pom- \
osgi-io.prometheus.simpleclient \
prometheus-simpleclient-java"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
