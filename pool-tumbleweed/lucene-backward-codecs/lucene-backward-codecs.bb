SUMMARY = "Backward-codecs module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'backward-codecs' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-backward-codecs-8.5.0-4.1.noarch.rpm"
RPM_HASH = "63cfabfa54fa96623c5898dbdb290c679c0faf50774a203577c65861134c6a9210563bdaf585ec0878a35a5f6bb9c00024a1fbff1a4127bc284a9151b340baf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-backward-codecs \
mvn-org.apache.lucene-lucene-backward-codecs \
mvn-org.apache.lucene-lucene-backward-codecs-pom- \
osgi-org.apache.lucene.backward-codecs"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
