SUMMARY = "Join module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'join' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-join-8.5.0-5.1.noarch.rpm"
RPM_HASH = "d4400a3c4b3e2ac86a677b8b8cec7ad4350c6500cd5c981186eec0b16dbaf260e33ca0ac44f54de6719831889fa9e1d22ab08e35ba383795093ff742431f59cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-join \
mvn-org.apache.lucene-lucene-join \
mvn-org.apache.lucene-lucene-join-pom- \
osgi-org.apache.lucene.join"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
