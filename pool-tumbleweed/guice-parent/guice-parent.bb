SUMMARY = "Guice parent POM"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides parent POM for Guice modules."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-parent-5.1.0-1.2.noarch.rpm"
RPM_HASH = "96028917b58ec7990afdf8503f38ba5b82e665299d4684e1329821aadb82a5c032c324927e48e92cc2d1af74294228988783e596fe76cbb28c2ea04d3534ffef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-parent \
mvn-com.google.inject-guice-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
