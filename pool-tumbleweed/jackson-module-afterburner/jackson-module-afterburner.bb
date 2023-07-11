SUMMARY = "Jackson module that uses byte-code generation to further speed up data binding"
DESCRIPTION = "Module that will add dynamic bytecode generation for standard Jackson POJO \
serializers and deserializers, eliminating majority of remaining data binding \
overhead."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-afterburner-2.13.3-1.8.noarch.rpm"
RPM_HASH = "207d2004b6a547fff8e1dddfe04e72dc5f3f6a5547abc33afb41a4c606125fa7c21cbc1d173d773cbfb09a3720a75e34188331ff1ea175fbd012a7a510ecf67d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-afterburner \
mvn-com.fasterxml.jackson.module-jackson-module-afterburner \
mvn-com.fasterxml.jackson.module-jackson-module-afterburner-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-afterburner"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-org.ow2.asm-asm"

inherit rpm
