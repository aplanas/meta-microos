SUMMARY = "Prometheus Java Simpleclient Httpserver"
DESCRIPTION = "Httpserver exposition for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-httpserver-0.8.0-6.11.noarch.rpm"
RPM_HASH = "ffc1ed5b8d22b1b73ecc3a642285fc09d8afd95938dabc67e5fbd5a1eb5a9b4baf776280492bc1c31322502819f371eb773f154b8a7d93d643e82df600ca6b44"
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
