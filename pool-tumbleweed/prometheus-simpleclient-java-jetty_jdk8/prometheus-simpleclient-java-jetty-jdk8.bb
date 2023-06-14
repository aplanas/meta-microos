SUMMARY = "Prometheus Java Simpleclient Jetty JDK 8"
DESCRIPTION = "Collector of data from Jetty Statistics for Jetty versions which require JDK 8."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-jetty_jdk8-0.8.0-6.10.noarch.rpm"
RPM_HASH = "660343d03c2137033fe4d11d6d9eacd0171474022ac67a363e803988c0b841150b48ed68a5821fd7798a02601373542b0f2eb3cbe00503b80edbdf74805edcc9"
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
