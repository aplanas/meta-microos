SUMMARY = "Jackson module that uses byte-code generation to further speed up data binding"
DESCRIPTION = "Module that will add dynamic bytecode generation for standard Jackson POJO \
serializers and deserializers, eliminating majority of remaining data binding \
overhead."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-afterburner-2.15.2-2.1.noarch.rpm"
RPM_HASH = "a7ef799cc07ef5687c5a0e9781df429a515642e224a743d67f1dbf7e5506509a678bf40b12c4e089e2edf85b3cb546a5a33300574181bfcdb02b4f9c4587cf86"
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
