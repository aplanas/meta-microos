SUMMARY = "Backward-codecs module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'backward-codecs' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-backward-codecs-8.5.0-3.4.noarch.rpm"
RPM_HASH = "22667f711f3a2f264b35fa8dc653df48b81a197b54280506aca98edca8879a879104b484515439b97ca6d754c916f90196ba177c63707d201b63c8a2e6c01cb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-backward-codecs \
mvn-org.apache.lucene-lucene-backward-codecs \
mvn-org.apache.lucene-lucene-backward-codecs-pom- \
osgi-org.apache.lucene.backward-codecs"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
