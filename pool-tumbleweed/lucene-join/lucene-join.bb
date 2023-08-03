SUMMARY = "Join module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'join' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-join-8.5.0-4.1.noarch.rpm"
RPM_HASH = "65344fdd854fa792b04766b93b90e1ae8a0e94ec3609c38d420db93b0085aa710575a9e72a29adcf1a6c7e6b27268052ba349e3c4540915b65233dcb42406fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-join \
mvn-org.apache.lucene-lucene-join \
mvn-org.apache.lucene-lucene-join-pom- \
osgi-org.apache.lucene.join"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
