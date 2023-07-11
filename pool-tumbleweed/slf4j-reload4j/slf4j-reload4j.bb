SUMMARY = "SLF4J LOG4J-12 Binding"
DESCRIPTION = "SLF4J LOG4J-12 Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-reload4j-1.7.36-4.2.noarch.rpm"
RPM_HASH = "ce3b954a780c777002a719f07eb5b0d245954e5f52f98d2d37e53fc6073ec75405058cfa90e36d66e90e7e34da8c6de70d47ffdd741b1bf723dc72a90f9a9504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-log4j12 \
mvn-org.slf4j-slf4j-log4j12-pom- \
mvn-org.slf4j-slf4j-reload4j \
mvn-org.slf4j-slf4j-reload4j-pom- \
osgi-slf4j.reload4j \
slf4j-log4j12 \
slf4j-reload4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-ch.qos.reload4j-reload4j \
mvn-org.slf4j-slf4j-api"

inherit rpm
