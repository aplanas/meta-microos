SUMMARY = "Sandbox module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'sandbox' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-sandbox-8.5.0-3.5.noarch.rpm"
RPM_HASH = "db0984954f8c9a4712ef242bfc7f0177ed509242681b45c21f04d5a3649582471420a7eafe98fa3d91c46383deca235f100f61fb7474c62a6276749512259484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-sandbox \
mvn-org.apache.lucene-lucene-sandbox \
mvn-org.apache.lucene-lucene-sandbox-pom- \
osgi-org.apache.lucene.sandbox"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
