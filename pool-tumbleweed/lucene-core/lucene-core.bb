SUMMARY = "Text search engine"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
It offers fuzzy search based on edit (Levenshtein) distance, \
incremental indexing, ranked searching, field-based searches and \
multi-index searches."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-core-8.5.0-3.5.noarch.rpm"
RPM_HASH = "c5969ac2439594becb65b23c2302307e4d5d9ee69e44606583c23f39bdd08fa470c43be79d5779f35eeca3c8878d5beb50ff2c27c5ced66117c594b38b7e6adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene \
lucene-core \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-core-pom- \
osgi-org.apache.lucene.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
