SUMMARY = "Misc module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'misc' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-misc-8.5.0-3.5.aarch64.rpm"
RPM_HASH = "bbbf595133c05cdb948e029adb65c800b7e9a6bb632de6ded1729020692cc91cbf0b266e2bac1ad81ab234243c7dc3ff7e46c24e518f2245d075ee2fa8f946fc"

RPROVIDES:${PN} += "lucene-misc \
mvn-org.apache.lucene-lucene-misc \
mvn-org.apache.lucene-lucene-misc-pom- \
osgi-org.apache.lucene.misc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
osgi-org.apache.lucene.core"

inherit rpm
