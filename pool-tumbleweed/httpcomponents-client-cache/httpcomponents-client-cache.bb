SUMMARY = "Cache module for httpcomponents-client"
DESCRIPTION = "This package provides client side caching for httpcomponents-client."
LICENSE = "Apache-2.0"

PV = "4.5.12"

RPM_NAME = "httpcomponents-client-cache-4.5.12-2.6.noarch.rpm"
RPM_HASH = "74cba29a3ab0188758c6e3c3e025e67743e892592aa563e9873358d7f57bf55eeb68f0ffc280c23ad5d17bcdd3ad96b4ba34328a9540f1b5b062b1f0cad3a3df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-client-cache \
mvn(org.apache.httpcomponents:httpclient-cache) \
mvn(org.apache.httpcomponents:httpclient-cache:pom:) \
osgi(org.apache.httpcomponents.httpclient-cache)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-logging:commons-logging) \
mvn(org.apache.httpcomponents:httpclient)"

inherit rpm
