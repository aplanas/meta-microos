SUMMARY = "Auto Value Parent"
DESCRIPTION = "Immutable value-type code generation for Java 1.6+."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-value-parent-1.6.1-1.10.noarch.rpm"
RPM_HASH = "e8afeff078fdebd279802c2c440282f6b8c60da769548ef94cbd1fc7abb84796450b8ddb7008ea64473e7a5ac8517793283135f02f4faa49fe4d68f2346c4632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-value-parent \
mvn(com.google.auto.value:auto-value-parent:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.auto:auto-parent:pom:)"

inherit rpm
