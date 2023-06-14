SUMMARY = "Test-docs module for maven-doxia"
DESCRIPTION = "This package provides Test-docs module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-test-docs-1.9.1-6.7.noarch.rpm"
RPM_HASH = "866ef6a6403eaa413189a9543462dd9e4e52193553039296826c414488d7536b8c041338f67195343d192d0f8371e59fc57c342b9609165b154500131104d3a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-test-docs \
mvn-org.apache.maven.doxia-doxia-test-docs \
mvn-org.apache.maven.doxia-doxia-test-docs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
