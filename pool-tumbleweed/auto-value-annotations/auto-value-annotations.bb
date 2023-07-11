SUMMARY = "Auto Value Annotations"
DESCRIPTION = "Immutable value-type code generation for Java 1.6+."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-value-annotations-1.6.1-1.11.noarch.rpm"
RPM_HASH = "4ed177c9c948980ca88db52330ee6975a40e7c5e3e5d1f162121929dcba7e82c96ddc355a35dd2b715f73c952024ca7f84913c40cbc10869c8a2eb51ed5d0ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-value-annotations \
mvn-com.google.auto.value-auto-value-annotations \
mvn-com.google.auto.value-auto-value-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
