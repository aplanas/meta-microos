SUMMARY = "Java Architecture for XML Binding"
DESCRIPTION = "Glassfish - JAXB (JSR 222) API."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.4.0"

RPM_NAME = "glassfish-jaxb-api-2.4.0-5.5.noarch.rpm"
RPM_HASH = "8611a33b00eb5d91785c9384392dd4f61684f292d23371eea6161fb9be227e599793297b0da29e7aec9443c97db7a285796bf50596ed2883a1697d1abd4f6505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-api \
mvn(javax.xml.bind:jaxb-api) \
mvn(javax.xml.bind:jaxb-api:pom:) \
osgi(jaxb-api)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.activation:javax.activation-api)"

inherit rpm
