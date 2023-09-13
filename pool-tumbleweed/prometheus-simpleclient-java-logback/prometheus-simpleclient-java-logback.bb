SUMMARY = "Prometheus Java Simpleclient logback"
DESCRIPTION = "Metrics collector for logback appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-logback-0.8.0-7.1.noarch.rpm"
RPM_HASH = "7d0ebe56da34c5f771fad2453b0dbde3c3fd53be75a089a63eae8288c1b7c889919980d318421febe3c0866a209df08b9a8d7b1b622d0d28a8fdcb7b0c972b7b"
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
