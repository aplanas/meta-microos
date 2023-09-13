SUMMARY = "Prometheus Java Simpleclient Common"
DESCRIPTION = "Common code used by various modules of the Simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-common-0.8.0-7.1.noarch.rpm"
RPM_HASH = "4d0b5a8bb520d7b723731a4009ebdc77295b75c1713ddfe7a2f3c88300af73818b3f60bc8b9d1a541b7a0b88b13726ac5015ea7994a13e26b235a5daad18068f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-common \
mvn-io.prometheus-simpleclient-common-pom- \
osgi-io.prometheus.simpleclient-common \
prometheus-simpleclient-java-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient"

inherit rpm
