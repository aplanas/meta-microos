SUMMARY = "Classification module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'classification' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-classification-8.5.0-3.4.noarch.rpm"
RPM_HASH = "0577257da3174521cbad8d3e8152fe923d465a19a0f5ae9debad7d95879035c25f5ffcc915b861bd75d10cbcc589eb6c05ae177a8e998b1cf49caa0dcc583640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-classification \
mvn(org.apache.lucene:lucene-classification) \
mvn(org.apache.lucene:lucene-classification:pom:) \
osgi(org.apache.lucene.classification)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.lucene:lucene-analyzers-common) \
mvn(org.apache.lucene:lucene-core) \
mvn(org.apache.lucene:lucene-grouping) \
mvn(org.apache.lucene:lucene-queries)"

inherit rpm
