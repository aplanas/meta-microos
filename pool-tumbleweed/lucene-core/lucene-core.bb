SUMMARY = "Text search engine"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
It offers fuzzy search based on edit (Levenshtein) distance, \
incremental indexing, ranked searching, field-based searches and \
multi-index searches."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-core-8.5.0-4.1.noarch.rpm"
RPM_HASH = "2a5fb02f8893fee0d83002f36be60faa73727c75b6fe968cb95bd7704c2c763fd63eaee59c43715d9b58dfed5a0073ca16c9f2f88a9355b0247950a53e683795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene \
lucene-core \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-core-pom- \
osgi-org.apache.lucene.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
