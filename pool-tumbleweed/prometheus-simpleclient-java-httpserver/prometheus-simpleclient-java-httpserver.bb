SUMMARY = "Prometheus Java Simpleclient Httpserver"
DESCRIPTION = "Httpserver exposition for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-httpserver-0.8.0-6.10.noarch.rpm"
RPM_HASH = "1c581703d815d4126c4b3525a1a8611892805ff9b3e92a8ed87c8530525522b19ea9c9aea76abca1f6a6db234e59849b07b893ace6fa5804a45cf8b24af6fa29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.prometheus:simpleclient_httpserver) \
mvn(io.prometheus:simpleclient_httpserver:pom:) \
osgi(io.prometheus.simpleclient_httpserver) \
prometheus-simpleclient-java-httpserver"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(io.prometheus:simpleclient) \
mvn(io.prometheus:simpleclient_common)"

inherit rpm
