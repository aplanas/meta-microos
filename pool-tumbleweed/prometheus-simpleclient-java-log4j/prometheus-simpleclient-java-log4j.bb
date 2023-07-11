SUMMARY = "Prometheus Java Simpleclient log4j"
DESCRIPTION = "Metrics collector for log4j appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-log4j-0.8.0-6.11.noarch.rpm"
RPM_HASH = "73dfca7612fd416145036aa79b29b2af4a8a23d1f34b5fda92a14152daf30b7de164222969e31a33fc9ed9533c2ff3c42f6a2c81b4512a909a534abf330177df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-log4j \
mvn-io.prometheus-simpleclient-log4j-pom- \
osgi-io.prometheus.simpleclient-log4j \
prometheus-simpleclient-java-log4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-log4j-log4j"

inherit rpm
