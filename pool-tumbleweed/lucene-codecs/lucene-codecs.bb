SUMMARY = "Codecs module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'codecs' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-codecs-8.5.0-5.1.noarch.rpm"
RPM_HASH = "518775c6736e04c16f43a61899798b1984ed8687721435700ff4ef13f25002f12890e7a21a7acdf355ad2aba1b91c651d3296d54158243c222f846ca9729a697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-codecs \
mvn-org.apache.lucene-lucene-codecs \
mvn-org.apache.lucene-lucene-codecs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
