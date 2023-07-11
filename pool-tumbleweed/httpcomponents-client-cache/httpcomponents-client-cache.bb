SUMMARY = "Cache module for httpcomponents-client"
DESCRIPTION = "This package provides client side caching for httpcomponents-client."
LICENSE = "Apache-2.0"

PV = "4.5.12"

RPM_NAME = "httpcomponents-client-cache-4.5.12-2.7.noarch.rpm"
RPM_HASH = "a1b6b7069bde1344b62ee5fb5c5e530d81494db96cef8f41ae653a8092b1cb8c946b585c15c27ebdc54f1e9c80eb9e275c0c1db862ddbe0b5bd0a3a0a876d790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-client-cache \
mvn-org.apache.httpcomponents-httpclient-cache \
mvn-org.apache.httpcomponents-httpclient-cache-pom- \
osgi-org.apache.httpcomponents.httpclient-cache"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging \
mvn-org.apache.httpcomponents-httpclient"

inherit rpm
