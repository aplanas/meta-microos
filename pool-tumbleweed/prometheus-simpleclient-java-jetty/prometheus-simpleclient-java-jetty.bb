SUMMARY = "Prometheus Java Simpleclient Jetty"
DESCRIPTION = "Collector of data from Jetty StatisticsHandler."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-jetty-0.8.0-6.11.noarch.rpm"
RPM_HASH = "db1669afe0021a5dcb579bad3260e89aaa9b9b3d0e8f5dfe47b64960509e64acbf0bd8a2084f3f4c564c8d7c9b4668443630cd7a9328899f639e3a8432a53d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-jetty \
mvn-io.prometheus-simpleclient-jetty-pom- \
osgi-io.prometheus.simpleclient-jetty \
prometheus-simpleclient-java-jetty"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-servlet"

inherit rpm
