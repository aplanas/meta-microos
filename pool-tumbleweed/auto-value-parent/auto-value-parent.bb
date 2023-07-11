SUMMARY = "Auto Value Parent"
DESCRIPTION = "Immutable value-type code generation for Java 1.6+."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-value-parent-1.6.1-1.11.noarch.rpm"
RPM_HASH = "b5ba867b5522b64fd9fa94df66f0eea605776804d6ad413c36ecb3a01ad173f307d39c77bab0ab02d00fe472bb66a93e7854f262d780f7be3fc72acc1aa18364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-value-parent \
mvn-com.google.auto.value-auto-value-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.auto-auto-parent-pom-"

inherit rpm
