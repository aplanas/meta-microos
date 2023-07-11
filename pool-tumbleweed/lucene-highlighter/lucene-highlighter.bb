SUMMARY = "Highlighter module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'highlighter' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-highlighter-8.5.0-3.5.noarch.rpm"
RPM_HASH = "dfc15ef0edc7e41bd6effb7a31536066fb397e9fb54f23a30b6eda05ba0a7044bc0e0595794036acff6f706a20a8a88fa4561e061bd09b743bbf94a02b3c4154"
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
