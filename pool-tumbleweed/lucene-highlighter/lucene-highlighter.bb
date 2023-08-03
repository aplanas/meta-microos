SUMMARY = "Highlighter module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'highlighter' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-highlighter-8.5.0-4.1.noarch.rpm"
RPM_HASH = "d9ce992be434965e1dad985845edf9b9de9e00f42254adcea35d6c6b1bd4ec0cd9e64c1d53376d9fe2340ce13ebb61012ef9da37fd84b74a61ae4f1996c55068"
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
