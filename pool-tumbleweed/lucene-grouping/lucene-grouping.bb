SUMMARY = "Grouping module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'grouping' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-grouping-8.5.0-3.4.noarch.rpm"
RPM_HASH = "c93c46e460d0395e419f758737a69872b4194e196e44ed09f399203186ae824a71fe6e0b65715af68f4aef986a52e90679f4fa083df4102f496e8c89e1a8a8fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-grouping \
mvn-org.apache.lucene-lucene-grouping \
mvn-org.apache.lucene-lucene-grouping-pom- \
osgi-org.apache.lucene.grouping"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-queries"

inherit rpm
