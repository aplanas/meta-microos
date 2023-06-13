SUMMARY = "Prometheus Java Simpleclient log4j"
DESCRIPTION = "Metrics collector for log4j appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-log4j-0.8.0-6.10.noarch.rpm"
RPM_HASH = "fe3ee2f657d5574b4d8e1ce7962e38d698429963d24b66711df3b02a6276cd5dc3e6739bd355a034f510288e4799a36708fada28ff3dda264bed084d169f27dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.prometheus:simpleclient_log4j) \
mvn(io.prometheus:simpleclient_log4j:pom:) \
osgi(io.prometheus.simpleclient_log4j) \
prometheus-simpleclient-java-log4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(io.prometheus:simpleclient) \
mvn(log4j:log4j)"

inherit rpm
