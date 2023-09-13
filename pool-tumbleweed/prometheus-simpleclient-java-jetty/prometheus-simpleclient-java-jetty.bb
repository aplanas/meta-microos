SUMMARY = "Prometheus Java Simpleclient Jetty"
DESCRIPTION = "Collector of data from Jetty StatisticsHandler."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-jetty-0.8.0-7.1.noarch.rpm"
RPM_HASH = "f0d4b8e468c7aa7a4b5eee5c48723473ab9b2764c3d1cadc52cc85c1ca6cc373340618f5015972546effddd6ee46639141d4827e0970dc8ee6e38b4d73780652"
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
