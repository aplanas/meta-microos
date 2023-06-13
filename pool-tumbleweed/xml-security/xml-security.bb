SUMMARY = "Apache XML Security for Java"
DESCRIPTION = "Apache XML Security for Java supports XML-Signature Syntax and Processing, \
W3C Recommendation 12 February 2002, and XML Encryption Syntax and \
Processing, W3C Recommendation 10 December 2002. As of version 1.4, \
the library supports the standard Java API JSR-105: XML Digital Signature APIs."
LICENSE = "Apache-2.0"

PV = "2.1.7"

RPM_NAME = "xml-security-2.1.7-3.10.noarch.rpm"
RPM_HASH = "dabc4fea7988d2c7d057e62dc2dc87824255016c04d4f9d931da595a1b512834722aa02b58307691d58194cdf66065eb8051df8cf4272e1d4269f0ba6df5c4cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.santuario:xmlsec) \
mvn(org.apache.santuario:xmlsec:pom:) \
osgi(org.apache.santuario.xmlsec) \
xml-security"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.woodstox:woodstox-core) \
mvn(commons-codec:commons-codec) \
mvn(org.slf4j:slf4j-api)"

inherit rpm
