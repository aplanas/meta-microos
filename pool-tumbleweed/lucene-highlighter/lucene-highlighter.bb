SUMMARY = "Highlighter module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'highlighter' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-highlighter-8.5.0-3.4.noarch.rpm"
RPM_HASH = "38731b16590569e8a76690a5e874126364d25ac00351d789f22682879998912b283fac6aeb60f52f6293fc71a9265198a9e92de09bd57cdd8d8b8406ac1dd07f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-highlighter \
mvn(org.apache.lucene:lucene-highlighter) \
mvn(org.apache.lucene:lucene-highlighter:pom:) \
osgi(org.apache.lucene.highlighter)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.lucene:lucene-core) \
mvn(org.apache.lucene:lucene-join) \
mvn(org.apache.lucene:lucene-memory) \
mvn(org.apache.lucene:lucene-queries)"

inherit rpm
