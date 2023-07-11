SUMMARY = "Analyzers-common module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-common' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-common-8.5.0-3.5.noarch.rpm"
RPM_HASH = "6bb622c7611c14c6f14f7419010863ad66024c9101b884e9271cf28737926af4ee0e9f270ddb0a81ef2ed2ab3a298b69ed099c33bfeee6497e924b27f75d6c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analysis \
lucene-analyzers-common \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-analyzers-common-pom- \
osgi-org.apache.lucene.analyzers-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
osgi-org.apache.lucene.core"

inherit rpm
