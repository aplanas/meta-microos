SUMMARY = "Highlighter module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'highlighter' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-highlighter-8.5.0-5.1.noarch.rpm"
RPM_HASH = "26edb322d332fead8988dae5a4c8aba83c2b78e8ea0a8cd6ac7117e62864c54f5fd93829d530367b451d5d49a801d50a0312938b93c835bbd589eefb1ff4cfa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-highlighter \
mvn-org.apache.lucene-lucene-highlighter \
mvn-org.apache.lucene-lucene-highlighter-pom- \
osgi-org.apache.lucene.highlighter"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-join \
mvn-org.apache.lucene-lucene-memory \
mvn-org.apache.lucene-lucene-queries"

inherit rpm
