SUMMARY = "Auto Value"
DESCRIPTION = "Immutable value-type code generation for Java 1.6+."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-value-1.6.1-1.10.noarch.rpm"
RPM_HASH = "4c5bacd18ee1363a170337209fa43f536dc1ff1ff1ea0af8fdf9ed0b2ddf04a0ded67fc365892505b752693c8d208a08448bbd3f0a9723cb856ba4ac169dbef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-value \
mvn(com.google.auto.value:auto-value) \
mvn(com.google.auto.value:auto-value:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.auto:auto-common) \
mvn(com.google.guava:guava) \
mvn(com.squareup:javapoet)"

inherit rpm
