SUMMARY = "Prometheus Java Simpleclient Jetty JDK 8"
DESCRIPTION = "Collector of data from Jetty Statistics for Jetty versions which require JDK 8."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-jetty_jdk8-0.8.0-6.11.noarch.rpm"
RPM_HASH = "134f69b02c694e50a1593b432d4a653c76e51f9f880c8f83fd27b601b1ed954974c880463749d39fe77ce2f66c08eadc2778e9f35f5eb7f75f24d5f03e14c181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-jetty-jdk8 \
mvn-io.prometheus-simpleclient-jetty-jdk8-pom- \
osgi-io.prometheus.simpleclient-jetty-jdk8 \
prometheus-simpleclient-java-jetty-jdk8"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-servlet"

inherit rpm
