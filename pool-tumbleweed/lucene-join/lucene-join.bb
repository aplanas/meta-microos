SUMMARY = "Join module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'join' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-join-8.5.0-3.5.noarch.rpm"
RPM_HASH = "a704bbb1b480f455788af7a9c0a9049f2f57040e38852c1e3266a51b171dad7e3698a99632df2fc164c2090686700d2830e51d8fca28a52fd531b92f1429ff61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-join \
mvn-org.apache.lucene-lucene-join \
mvn-org.apache.lucene-lucene-join-pom- \
osgi-org.apache.lucene.join"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
