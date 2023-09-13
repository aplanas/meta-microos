SUMMARY = "Jackson-JAXRS-XML"
DESCRIPTION = "Functionality to handle Smile XML input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-xml-provider-2.15.2-2.1.noarch.rpm"
RPM_HASH = "b71a70e79eabbf17032ea0134244307ed03712aa0013db3eb9db202db395bbc292a00ab0d55ed8eb84077b9f96a541c8ddd8c22db4cfd24406725db23a177aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-xml-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-xml-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-xml-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-xml-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-xml \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations \
mvn-com.fasterxml.woodstox-woodstox-core \
mvn-org.codehaus.woodstox-stax2-api"

inherit rpm
