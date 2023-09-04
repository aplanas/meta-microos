SUMMARY = "Jackson module that uses byte-code generation to further speed up data binding"
DESCRIPTION = "Module that will add dynamic bytecode generation for standard Jackson POJO \
serializers and deserializers, eliminating majority of remaining data binding \
overhead."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-afterburner-2.15.2-1.1.noarch.rpm"
RPM_HASH = "acc9d11c883b582ba0a35f5b8d789ccce3dff08c1992ee2095a7f3adecd78b8d76c0ad2d65c31e13d32e077af81f8673cb3ff7b0e6210ea1be779e8cde453f93"
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
