SUMMARY = "Analyzers-smartcn module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-smartcn' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-smartcn-8.5.0-3.4.noarch.rpm"
RPM_HASH = "9a803a80d08be24685259be3477648a5494447eb00a4c0f46b56a3cfaec462dd513fc3866d785eac5979d25012bbe7532a66f25b86f8cbe349255d205ca7ab61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analyzers-smartcn \
mvn(org.apache.lucene:lucene-analyzers-smartcn) \
mvn(org.apache.lucene:lucene-analyzers-smartcn:pom:) \
osgi(org.apache.lucene.analyzers-smartcn)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.lucene:lucene-analyzers-common) \
mvn(org.apache.lucene:lucene-core)"

inherit rpm
