SUMMARY = "Prometheus Java Simpleclient Pushgateway"
DESCRIPTION = "Pushgateway exporter for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-pushgateway-0.8.0-6.10.noarch.rpm"
RPM_HASH = "ed7da8b5b94f6b39231d81f8b7560fe77b05f462bb68c6f847d678acdec678eb3cccf52bf2726fa8d47e08eec49c373fb0d55721a72c12e3a7df804729e72b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.prometheus:simpleclient_pushgateway) \
mvn(io.prometheus:simpleclient_pushgateway:pom:) \
osgi(io.prometheus.simpleclient_pushgateway) \
prometheus-simpleclient-java-pushgateway"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(io.prometheus:simpleclient) \
mvn(io.prometheus:simpleclient_common)"

inherit rpm
