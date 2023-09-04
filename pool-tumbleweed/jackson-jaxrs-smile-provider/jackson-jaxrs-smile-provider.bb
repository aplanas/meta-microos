SUMMARY = "Jackson-JAXRS-Smile"
DESCRIPTION = "Functionality to handle Smile (binary JSON) input/output for \
JAX-RS implementations (like Jersey and RESTeasy) using standard \
Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-smile-provider-2.15.2-1.1.noarch.rpm"
RPM_HASH = "66dae1e0af461dd9c07d984df227101f8ea6f6b36cecc7592bdd0b199fa9b2ea0756bf1b0e779e7645c11738a28595dc96b730d5aaa5a68214e11ca93dcbd51d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-smile-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-smile-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-smile-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-smile-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-smile \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations"

inherit rpm
