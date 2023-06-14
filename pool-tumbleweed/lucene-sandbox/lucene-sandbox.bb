SUMMARY = "Sandbox module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'sandbox' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-sandbox-8.5.0-3.4.noarch.rpm"
RPM_HASH = "404604769bd4a7c0641625c2bf47e7d97ce28ea05149219f37144fd9627543b2c9a8f4a1e9f21ab46cdccfc0c38bf1759be91ba95a5b4637c1a67df713e49454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-sandbox \
mvn-org.apache.lucene-lucene-sandbox \
mvn-org.apache.lucene-lucene-sandbox-pom- \
osgi-org.apache.lucene.sandbox"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
