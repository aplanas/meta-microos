SUMMARY = "Prometheus Java Simpleclient logback"
DESCRIPTION = "Metrics collector for logback appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-logback-0.8.0-6.10.noarch.rpm"
RPM_HASH = "7076e627ebe14ceef6512dd19d1f143a71407be77c9bb9004b4a1a8d24c694bf53c480bb5028484c65c60976698c6549326c165454dba9617ca48d33686bd698"
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
