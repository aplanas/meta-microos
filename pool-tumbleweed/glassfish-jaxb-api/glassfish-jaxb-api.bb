SUMMARY = "Java Architecture for XML Binding"
DESCRIPTION = "Glassfish - JAXB (JSR 222) API."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.4.0"

RPM_NAME = "glassfish-jaxb-api-2.4.0-5.6.noarch.rpm"
RPM_HASH = "9b9b68e1a81673640aadcdeef339b570052c5577aa64106f55e99a87fbfbb431d553811b5497335c16fd4f415fa03e54b35404451b2f7d2b86f33bc3aaadf2e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-api \
mvn-javax.xml.bind-jaxb-api \
mvn-javax.xml.bind-jaxb-api-pom- \
osgi-jaxb-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.activation-javax.activation-api"

inherit rpm
