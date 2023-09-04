SUMMARY = "Analyzers-smartcn module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-smartcn' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-smartcn-8.5.0-5.1.noarch.rpm"
RPM_HASH = "6151b91ce10e7a594ad430968699fa63854e57df8cb161ca525f0e83347dcf74aa060b50c9c7f70e0f68934c1278a33d6f6e1307df1b9eea1d54affe38c22b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analyzers-smartcn \
mvn-org.apache.lucene-lucene-analyzers-smartcn \
mvn-org.apache.lucene-lucene-analyzers-smartcn-pom- \
osgi-org.apache.lucene.analyzers-smartcn"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core"

inherit rpm
