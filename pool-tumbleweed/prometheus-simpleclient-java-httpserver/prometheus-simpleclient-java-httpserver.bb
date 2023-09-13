SUMMARY = "Prometheus Java Simpleclient Httpserver"
DESCRIPTION = "Httpserver exposition for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-httpserver-0.8.0-7.1.noarch.rpm"
RPM_HASH = "d16a66d5644af36c0d4093d0d05c27f24031c74e2b47cbdc788de16614a32fccdd864a6e7756b1628035296d61471046a5b8093559f17ef81163a1e064cbed70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-httpserver \
mvn-io.prometheus-simpleclient-httpserver-pom- \
osgi-io.prometheus.simpleclient-httpserver \
prometheus-simpleclient-java-httpserver"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-common"

inherit rpm
