SUMMARY = "XSOM"
DESCRIPTION = "XML Schema Object Model (XSOM) is a Java library that allows \
applications to easily parse XML Schema documents and inspect \
information in them. It is expected to be useful for applications \
that need to take XML Schema as an input."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-xsom-2.3.1-4.4.noarch.rpm"
RPM_HASH = "df464faef9530aae2599cbafc7874af8ad6868e6c94236a8eb537af8209e2584d712c310f05a39a4c60a35cf588680c83bac1b1b77560db024b02123ff41a8d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-xsom \
mvn-org.glassfish.jaxb-xsom \
mvn-org.glassfish.jaxb-xsom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.external-relaxng-datatype"

inherit rpm
