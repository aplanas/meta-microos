SUMMARY = "Prometheus Java Simpleclient guava"
DESCRIPTION = "Metrics collector for guava based caches."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-guava-0.8.0-6.11.noarch.rpm"
RPM_HASH = "35c2003640e6b126024645dc2a5b05a9f349e73a585accac9475b0e0b7f9ba6ed31386a9f84be1943b3f9fbc4c4c77059e624b7f2ce5afbc8382358cce2e9a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-guava \
mvn-io.prometheus-simpleclient-guava-pom- \
osgi-io.prometheus.simpleclient-guava \
prometheus-simpleclient-java-guava"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava \
mvn-io.prometheus-simpleclient"

inherit rpm
