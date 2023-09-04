SUMMARY = "Backward-codecs module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'backward-codecs' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-backward-codecs-8.5.0-5.1.noarch.rpm"
RPM_HASH = "94c1e7d4bc2e31aa60599db253d8e15531791b0d9817faaeb6c32a293bccb5ffde1bcb20fb9e229b76cc9e89dc7e0b03c27e0ced228ff09a71efeae055d3ebea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-backward-codecs \
mvn-org.apache.lucene-lucene-backward-codecs \
mvn-org.apache.lucene-lucene-backward-codecs-pom- \
osgi-org.apache.lucene.backward-codecs"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
