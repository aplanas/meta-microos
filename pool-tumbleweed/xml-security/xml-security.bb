SUMMARY = "Apache XML Security for Java"
DESCRIPTION = "Apache XML Security for Java supports XML-Signature Syntax and Processing, \
W3C Recommendation 12 February 2002, and XML Encryption Syntax and \
Processing, W3C Recommendation 10 December 2002. As of version 1.4, \
the library supports the standard Java API JSR-105: XML Digital Signature APIs."
LICENSE = "Apache-2.0"

PV = "2.1.7"

RPM_NAME = "xml-security-2.1.7-3.11.noarch.rpm"
RPM_HASH = "23bc33bad13bd3250c0ab57771d52ed0a3be8694ff98b9762a171d5561373730d18169ca86644d86611f1bc25bf7458fa785589a625dde5ffe1244e697fb0dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.santuario-xmlsec \
mvn-org.apache.santuario-xmlsec-pom- \
osgi-org.apache.santuario.xmlsec \
xml-security"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.woodstox-woodstox-core \
mvn-commons-codec-commons-codec \
mvn-org.slf4j-slf4j-api"

inherit rpm
