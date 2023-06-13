SUMMARY = "AutoService Processor"
DESCRIPTION = "Provider-configuration files for ServiceLoader."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-service-1.6.1-1.10.noarch.rpm"
RPM_HASH = "daea8922253f5309ef6a7f130b2037dbcc393d7a4c21b13dfba18ff09f224f11da810d7681a973c9667d1bb11a8d3ddbd49f5e2c23018b3a023c012dc192fbe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-service \
mvn(com.google.auto.service:auto-service) \
mvn(com.google.auto.service:auto-service:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.auto.service:auto-service-annotations) \
mvn(com.google.auto:auto-common) \
mvn(com.google.guava:guava)"

inherit rpm
