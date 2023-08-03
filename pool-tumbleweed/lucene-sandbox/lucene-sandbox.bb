SUMMARY = "Sandbox module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'sandbox' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-sandbox-8.5.0-4.1.noarch.rpm"
RPM_HASH = "69000c746328275d37df803aaa3f5e5c603b58f1ac0e987fa89236fb25e3cfa5adbb6c3b5d4a525475945cfe29dec5fdba012a34c1b53bca4159d9d055fdb633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-sandbox \
mvn-org.apache.lucene-lucene-sandbox \
mvn-org.apache.lucene-lucene-sandbox-pom- \
osgi-org.apache.lucene.sandbox"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
