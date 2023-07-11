SUMMARY = "Codecs module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'codecs' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-codecs-8.5.0-3.5.noarch.rpm"
RPM_HASH = "cf4e0da7cf013b1fda2c9dd952c9352730f9b96a06d536d7c262d728e8e557a64f89972c3830a350830d65af6f6def95c648dc8314eb64a3d67dd270e57b8df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-codecs \
mvn-org.apache.lucene-lucene-codecs \
mvn-org.apache.lucene-lucene-codecs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
