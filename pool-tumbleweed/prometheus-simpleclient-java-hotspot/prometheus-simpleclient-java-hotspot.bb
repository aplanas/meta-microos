SUMMARY = "Prometheus Java Simpleclient Hotspot"
DESCRIPTION = "Collectors of data from Java Hotspot."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-hotspot-0.8.0-7.1.noarch.rpm"
RPM_HASH = "06878b75279bcc6d96c745b3090e513ab96291414ead985ffbb5e638c8a37c72e7821eaed90eca2b45ae042639a02c36f09e14058a2bc404bec246289f918b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-hotspot \
mvn-io.prometheus-simpleclient-hotspot-pom- \
osgi-io.prometheus.simpleclient-hotspot \
prometheus-simpleclient-java-hotspot"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient"

inherit rpm
