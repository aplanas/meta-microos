SUMMARY = "Codecs module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'codecs' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-codecs-8.5.0-3.4.noarch.rpm"
RPM_HASH = "d25a7fbd843ad9d7346e7ef171ee2acbd574c66b34bbb8a28e2812da5dcb606b88dac11b3658a5be9321a424006f5e9bd9e9c983f350402fe4495fe3388afcac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-codecs \
mvn-org.apache.lucene-lucene-codecs \
mvn-org.apache.lucene-lucene-codecs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
