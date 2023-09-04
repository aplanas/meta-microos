SUMMARY = "Jackson-JAXRS-JSON"
DESCRIPTION = "Functionality to handle JSON input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-json-provider-2.15.2-1.1.noarch.rpm"
RPM_HASH = "68c7fa177e38faefdd7e777df2962486aedf98942710e38b30abc72a1ce6152f1177318c678aa47d232469a486397be5c0e9dafa63a92947d81ed377a0f902a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-json-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-json-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-json-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-json-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations"

inherit rpm
