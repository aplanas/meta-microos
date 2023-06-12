SUMMARY = "Prometheus Java Simpleclient Jetty"
DESCRIPTION = "Collector of data from Jetty StatisticsHandler."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-jetty-0.8.0-6.10.noarch.rpm"
RPM_HASH = "9b24f7d91408c236721e6c0ab411f55b9ec2879c87fac37f5741b1dfe199f897c3e46c8fddbd8e3dbf056f843b2318807e09ca00ca60566a01961f6b2b86de54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.prometheus:simpleclient_jetty) \
mvn(io.prometheus:simpleclient_jetty:pom:) \
osgi(io.prometheus.simpleclient_jetty) \
prometheus-simpleclient-java-jetty"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(io.prometheus:simpleclient) \
mvn(org.eclipse.jetty:jetty-server) \
mvn(org.eclipse.jetty:jetty-servlet)"

inherit rpm
