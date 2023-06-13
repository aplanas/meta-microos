SUMMARY = "Jackson-JAXRS-JSON"
DESCRIPTION = "Functionality to handle JSON input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-jaxrs-json-provider-2.13.3-1.7.noarch.rpm"
RPM_HASH = "9dc2a09c86dd0901788ab0a2fb1f3612d541592344fd170954aede48fc8309de03877bbf108be0cbe0982411726e17483599e174948741fcc90083f3b50240ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-json-provider \
mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider) \
mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:pom:) \
osgi(com.fasterxml.jackson.jaxrs.jackson-jaxrs-json-provider)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-base) \
mvn(com.fasterxml.jackson.module:jackson-module-jaxb-annotations)"

inherit rpm
