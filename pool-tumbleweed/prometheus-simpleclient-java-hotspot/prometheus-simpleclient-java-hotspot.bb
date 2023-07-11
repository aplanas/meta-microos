SUMMARY = "Prometheus Java Simpleclient Hotspot"
DESCRIPTION = "Collectors of data from Java Hotspot."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-hotspot-0.8.0-6.11.noarch.rpm"
RPM_HASH = "dc16d24fd1c9d2ebbf1eda7c201c995c970decbb0be52b2a01235679a6f9d22fcf3361439240bd296d789df256da4ccf4d73ea9a298a7dfdfea8c9b9bd3114a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-hotspot \
mvn-io.prometheus-simpleclient-hotspot-pom- \
osgi-io.prometheus.simpleclient-hotspot \
prometheus-simpleclient-java-hotspot"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient"

inherit rpm
