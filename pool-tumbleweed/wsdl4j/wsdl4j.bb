SUMMARY = "Web Services Description Language Toolkit for Java"
DESCRIPTION = "The Web Services Description Language for Java Toolkit (WSDL4J) allows \
the creation, representation, and manipulation of WSDL documents \
describing services.  This codebase will eventually serve as a \
reference implementation of the standard created by JSR110."
LICENSE = "IPL-1.0"

PV = "1.6.3"

RPM_NAME = "wsdl4j-1.6.3-11.6.noarch.rpm"
RPM_HASH = "23d35d6bfbacb69aa95af0325e88d9871558cee4f856ffd3c7f5ced3d720ee59b6229e0957b1431caa877403a62691ff2761f1a5b6b862555dc945be7b307b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(axis:axis-wsdl4j) \
mvn(axis:axis-wsdl4j:pom:) \
mvn(wsdl4j:wsdl4j) \
mvn(wsdl4j:wsdl4j:pom:) \
osgi(javax.wsdl) \
wsdl4j"
RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
jaxp_parser_impl"

inherit rpm
