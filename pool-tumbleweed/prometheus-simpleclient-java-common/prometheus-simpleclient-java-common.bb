SUMMARY = "Prometheus Java Simpleclient Common"
DESCRIPTION = "Common code used by various modules of the Simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-common-0.8.0-6.11.noarch.rpm"
RPM_HASH = "ae733f88760dc5acf6d83300593b8f097377fe03b72f9b1463bbb90056d14e8168eba450336851d63900d9a2413f49c0402b2c8ff9f88eafe5f836f2b1dbb015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-common \
mvn-io.prometheus-simpleclient-common-pom- \
osgi-io.prometheus.simpleclient-common \
prometheus-simpleclient-java-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient"

inherit rpm
