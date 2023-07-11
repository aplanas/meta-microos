SUMMARY = "Prometheus Java Simpleclient Servlet"
DESCRIPTION = "HTTP servlet exporter for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-servlet-0.8.0-6.11.noarch.rpm"
RPM_HASH = "826885a1c9e57698d928cacf23fbdf2fd91da70d7a6bf47a29fb558cb24feb44c312cf7fd4bada92a0a65e698d61fbd539ec75c331b6a2a3149666fee90a2f16"
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
