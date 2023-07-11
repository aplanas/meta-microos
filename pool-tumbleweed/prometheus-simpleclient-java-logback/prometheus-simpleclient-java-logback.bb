SUMMARY = "Prometheus Java Simpleclient logback"
DESCRIPTION = "Metrics collector for logback appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-logback-0.8.0-6.11.noarch.rpm"
RPM_HASH = "fc696e1c06de3c1b3c70b63a27f03ff0ed2b519b1b5e284d6f5112f050b9d7c0586e671bf2a3ebcbdc4214840cac0fca3df46dab79af74913428d05cdabffa53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-logback \
mvn-io.prometheus-simpleclient-logback-pom- \
osgi-io.prometheus.simpleclient-logback \
prometheus-simpleclient-java-logback"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-ch.qos.logback-logback-classic \
mvn-io.prometheus-simpleclient"

inherit rpm
