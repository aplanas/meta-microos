SUMMARY = "Text search engine"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
It offers fuzzy search based on edit (Levenshtein) distance, \
incremental indexing, ranked searching, field-based searches and \
multi-index searches."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-core-8.5.0-5.1.noarch.rpm"
RPM_HASH = "15a8c87ca3fdf1e3101bc90c0d3cbb0e89fa08b5c77698d77d78e759a52882a7662d608f3d8881f10b1f98a807c3078faad74ab162ea565976ae57f942107e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene \
lucene-core \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-core-pom- \
osgi-org.apache.lucene.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
