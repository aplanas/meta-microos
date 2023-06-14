SUMMARY = "Apache HttpAsyncClient Cache"
DESCRIPTION = "This package provides client side caching for httpcomponents-asyncclient."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-cache-4.1.4-3.9.noarch.rpm"
RPM_HASH = "676f89c181bf7b444af9ce228cf5706c3cff35073e46a03e183d16dcbe75d0c5e280a33154da4e45794aaebbcf37382d97547eaac7ba94a2b60d95ce8a09154b"
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
