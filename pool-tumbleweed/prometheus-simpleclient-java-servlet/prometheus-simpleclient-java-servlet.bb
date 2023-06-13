SUMMARY = "Prometheus Java Simpleclient Servlet"
DESCRIPTION = "HTTP servlet exporter for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-servlet-0.8.0-6.10.noarch.rpm"
RPM_HASH = "f7191ef3956cf900323c7f71b1bd243a70494bb1cc2887beff7457b0370e0bb56476cc13154a182639c3c1ace22c1b197a92dfd4dfff8f9c78b3670e8da0ecd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.prometheus:simpleclient_servlet) \
mvn(io.prometheus:simpleclient_servlet:pom:) \
osgi(io.prometheus.simpleclient_servlet) \
prometheus-simpleclient-java-servlet"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(io.prometheus:simpleclient) \
mvn(io.prometheus:simpleclient_common)"

inherit rpm
