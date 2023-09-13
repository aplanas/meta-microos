SUMMARY = "Prometheus Java Simpleclient Jetty JDK 8"
DESCRIPTION = "Collector of data from Jetty Statistics for Jetty versions which require JDK 8."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-jetty_jdk8-0.8.0-7.1.noarch.rpm"
RPM_HASH = "3ee7e9bcf901bfbaf1796cb8bbce7ef3781aec7cfca96f773953e6b9ce283f543421ca15f3c2083ee86e5ddccd6b2172708c26b08bfcd7a313f9e6ef26f94cb3"
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
