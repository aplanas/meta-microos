SUMMARY = "Codecs module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'codecs' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-codecs-8.5.0-4.1.noarch.rpm"
RPM_HASH = "3e14d4a555d38ebd1aa6bdc7bfe0ddf50df0bfe140d4d0f61b50a6e38311401376a4fd2ee6db2e3e93c67d68df6e54a0fa2aeff27c8ef76f9f65ce1f3ae28540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-codecs \
mvn-org.apache.lucene-lucene-codecs \
mvn-org.apache.lucene-lucene-codecs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
