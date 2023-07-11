SUMMARY = "Web Services Description Language Toolkit for Java"
DESCRIPTION = "The Web Services Description Language for Java Toolkit (WSDL4J) allows \
the creation, representation, and manipulation of WSDL documents \
describing services.  This codebase will eventually serve as a \
reference implementation of the standard created by JSR110."
LICENSE = "IPL-1.0"

PV = "1.6.3"

RPM_NAME = "wsdl4j-1.6.3-11.7.noarch.rpm"
RPM_HASH = "85bad0acd42e3f52fc0c53538b1e85a4cd38d84dc88b58201295781c4d66336684fbc7ad91502f7a704db3f83785a7b13d5302fab2ccdb06204c1bee8d9cf4cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-axis-axis-wsdl4j \
mvn-axis-axis-wsdl4j-pom- \
mvn-wsdl4j-wsdl4j \
mvn-wsdl4j-wsdl4j-pom- \
osgi-javax.wsdl \
wsdl4j"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
jaxp-parser-impl"

inherit rpm
