SUMMARY = "Prometheus Java Simpleclient log4j"
DESCRIPTION = "Metrics collector for log4j appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-log4j-0.8.0-7.1.noarch.rpm"
RPM_HASH = "188cc6b35b0170ce1a8ecf698797422ab58be2f865d1817d7c290beb2beb2ee67f4b87f5dcfb96a3f728859701b0b61ef691d8cc2df8362f208fbba169e7e253"
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
