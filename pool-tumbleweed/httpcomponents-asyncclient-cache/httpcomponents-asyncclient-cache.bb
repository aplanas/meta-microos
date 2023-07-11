SUMMARY = "Apache HttpAsyncClient Cache"
DESCRIPTION = "This package provides client side caching for httpcomponents-asyncclient."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-cache-4.1.4-3.10.noarch.rpm"
RPM_HASH = "e4f935ca34e8cb10053a91e32847654ae9ca895b3d7cf6c4d9f27ddbfd7c358f6c69a3c4c42e111c56807c8f72f8a6e69938c3a461b0692f37f3315f2ece49ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-asyncclient-cache \
mvn-org.apache.httpcomponents-httpasyncclient-cache \
mvn-org.apache.httpcomponents-httpasyncclient-cache-pom- \
osgi-org.apache.httpcomponents.httpasyncclient-cache"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.httpcomponents-httpasyncclient \
mvn-org.apache.httpcomponents-httpclient-cache"

inherit rpm
