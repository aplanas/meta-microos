SUMMARY = "Jakarta XML Binding API"
DESCRIPTION = "The Jakarta XML Binding provides an API and tools that automate the mapping \
between XML documents and Java objects."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "jaxb-api-4.0.0-2.6.noarch.rpm"
RPM_HASH = "7fc7e9c4e63d7a2a37495dee0f7263f0151e951a0f3568b015bbc0642e92c2f8c9d6fe1f943153c8bda4fd3fb2f38894054e6f1f2ba5484c729190dcb639d29e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxb-api \
mvn-jakarta.xml.bind-jakarta.xml.bind-api \
mvn-jakarta.xml.bind-jakarta.xml.bind-api-pom- \
osgi-jakarta.xml.bind-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jakarta.activation-jakarta.activation-api"

inherit rpm
