SUMMARY = "Grouping module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'grouping' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-grouping-8.5.0-3.5.noarch.rpm"
RPM_HASH = "e581aad313cc9928d9bef68b0dd94077a1fc98bd077c6c0770428f569342a3a816c05a8aa2cbfb4162ebd6cb34892f0b725444bef6c6c63c1d6552f6f14d73c4"
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
