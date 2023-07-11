SUMMARY = "Backward-codecs module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'backward-codecs' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-backward-codecs-8.5.0-3.5.noarch.rpm"
RPM_HASH = "aa743a1a41f159e72e4b2c65ad602a331d2c129c8347628f2c31027688313e5701338cca3ec70f17c2b321019d13c1996b3385ba61a680561c08705137320415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-backward-codecs \
mvn-org.apache.lucene-lucene-backward-codecs \
mvn-org.apache.lucene-lucene-backward-codecs-pom- \
osgi-org.apache.lucene.backward-codecs"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
