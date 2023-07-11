SUMMARY = "Prometheus Java Simpleclient log4j2"
DESCRIPTION = "Metrics collector for log4j2 appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-log4j2-0.8.0-6.11.noarch.rpm"
RPM_HASH = "0c2a1463c80723d6bfa7ab093a1c3fe33564823b1581009c926f2d1537957ab5fc582bccdf67d812bd70f518007b012f1ce8def0c3e2166a128912e123bea383"
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
