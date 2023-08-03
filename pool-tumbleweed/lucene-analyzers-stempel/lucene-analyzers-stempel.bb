SUMMARY = "Analyzers-stempel module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-stempel' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-stempel-8.5.0-4.1.noarch.rpm"
RPM_HASH = "63b8fcd54c34c1eb1aae56fffea08e8e76fd5b2986459bea21b38f3bd28c00e06092ac2331504b5c52a4d3d7a9dc32cde9dfbbb4890e17aa269fbd7c040b3275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analyzers-stempel \
mvn-org.apache.lucene-lucene-analyzers-stempel \
mvn-org.apache.lucene-lucene-analyzers-stempel-pom- \
osgi-org.apache.lucene.analyzers-stempel"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core"

inherit rpm
