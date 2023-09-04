SUMMARY = "Jackson-JAXRS-XML"
DESCRIPTION = "Functionality to handle Smile XML input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-xml-provider-2.15.2-1.1.noarch.rpm"
RPM_HASH = "c10a042e79eb94b024ae6a92b4261758c0c04c6a91ce57107e66aa6e01335ce40aa3d3191397ff8d58ac2fea6da96452cf8d51e69899e27daccb76891b72c991"
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
