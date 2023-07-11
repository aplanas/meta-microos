SUMMARY = "XSOM"
DESCRIPTION = "XML Schema Object Model (XSOM) is a Java library that allows \
applications to easily parse XML Schema documents and inspect \
information in them. It is expected to be useful for applications \
that need to take XML Schema as an input."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-xsom-2.3.1-4.5.noarch.rpm"
RPM_HASH = "feb44c7744fccf7885720da0d88a5cd6cdc0ebbf16dc5dc4d562a9edb2972532c0d5391606202d13c1f9798725ee03e336c3caa22973a5831ac4141eb9af1402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-xsom \
mvn-org.glassfish.jaxb-xsom \
mvn-org.glassfish.jaxb-xsom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.external-relaxng-datatype"

inherit rpm
