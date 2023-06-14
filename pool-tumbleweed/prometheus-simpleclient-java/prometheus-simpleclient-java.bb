SUMMARY = "Prometheus Java Suite"
DESCRIPTION = "The Prometheus Java Suite: Client Metrics, Exposition, and Examples."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-0.8.0-6.10.noarch.rpm"
RPM_HASH = "aafbad8e240276f0c6435b2fa09f99fc55e3f0b4e894f54c6dea592615e7434761b57cd344d9f48c72b19a84c49fa79c61c0be008f9b2958362beb13362e8195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-pom- \
osgi-io.prometheus.simpleclient \
prometheus-simpleclient-java"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
