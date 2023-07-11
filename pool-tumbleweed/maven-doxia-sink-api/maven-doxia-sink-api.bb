SUMMARY = "Sink-api module for maven-doxia"
DESCRIPTION = "This package provides Sink-api module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-sink-api-1.9.1-6.8.noarch.rpm"
RPM_HASH = "a94584fc1e3d66d1bc25c1b9792f162764e4b31d234760365e1f6b23355957a4a623f3f124307fcb4eefa2bd3face0f2d8c953258aae802cd184c3e9e74e85a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-sink-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-logging-api"

inherit rpm
