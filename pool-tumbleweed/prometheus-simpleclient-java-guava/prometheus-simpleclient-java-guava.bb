SUMMARY = "Prometheus Java Simpleclient guava"
DESCRIPTION = "Metrics collector for guava based caches."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-guava-0.8.0-7.1.noarch.rpm"
RPM_HASH = "839ed70d4e6612d57c134d44751e970e0ce5bb6e3cd53d3f9957d77d3c22bb77d2478e89f61bf13af6052058d06b8452e2e8a4a3fffdd11445614bf2ba10518c"
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
