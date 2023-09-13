SUMMARY = "Prometheus Java Simpleclient log4j2"
DESCRIPTION = "Metrics collector for log4j2 appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-log4j2-0.8.0-7.1.noarch.rpm"
RPM_HASH = "6af434b9a4a0c6de9076f29ae4047ce280c341c02fb9d32f5c5ca26fd0ff95e9e35b145d81bd519e67b85fae77b963c6abfecd4045a4a4861642f83955e5365a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-log4j2 \
mvn-io.prometheus-simpleclient-log4j2-pom- \
osgi-io.prometheus.simpleclient-log4j2 \
prometheus-simpleclient-java-log4j2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-org.apache.logging.log4j-log4j-core"

inherit rpm
