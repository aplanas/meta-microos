SUMMARY = "Queries module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'queries' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-queries-8.5.0-5.1.noarch.rpm"
RPM_HASH = "a115deefe2e59f5f648fb1b6f82a1d9275ebd34d647b0b033703c7d30e10ab0c9f0e465e553fb3735660fea33c0fa15ad640835020fa19ccefd26a2426106200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-queries \
mvn-org.apache.lucene-lucene-queries \
mvn-org.apache.lucene-lucene-queries-pom- \
osgi-org.apache.lucene.queries"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
