SUMMARY = "AutoService Processor"
DESCRIPTION = "Provider-configuration files for ServiceLoader."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-service-1.6.1-1.11.noarch.rpm"
RPM_HASH = "a5233134bc0c6e17702db7c65ece35ae94eb9eee2166182ac80afbce7e08fc5bf1a42fdc8eabcb8539096900a7a9574b43a380c0be3656583c5f1cb99ce35501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-service \
mvn-com.google.auto.service-auto-service \
mvn-com.google.auto.service-auto-service-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.auto-auto-common \
mvn-com.google.auto.service-auto-service-annotations \
mvn-com.google.guava-guava"

inherit rpm
