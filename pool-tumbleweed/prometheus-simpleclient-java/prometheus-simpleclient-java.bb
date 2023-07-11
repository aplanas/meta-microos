SUMMARY = "Prometheus Java Suite"
DESCRIPTION = "The Prometheus Java Suite: Client Metrics, Exposition, and Examples."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-0.8.0-6.11.noarch.rpm"
RPM_HASH = "b7b7837ad6236da308ac4a328d49d2cc3658275995d58b56d9e6a392a6ffa327f41bc0e6e510b870c1f14ecc69954ac34f998e92fd80d9d5196615a3f3c494d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-pom- \
osgi-io.prometheus.simpleclient \
prometheus-simpleclient-java"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
