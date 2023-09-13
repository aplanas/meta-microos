SUMMARY = "Functionality for implementing interfaces and abstract types dynamically"
DESCRIPTION = "Mr Bean is an extension that implements support for 'POJO type materialization' \
ability for databinder to construct implementation classes for Java interfaces \
and abstract classes, as part of deserialization."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-mrbean-2.15.2-2.1.noarch.rpm"
RPM_HASH = "55907bdb840cdb8155d1d87a5d601a682e679944c3d9ce33c49b4bf44202465efbb4435347d6e7c3fcb37d0800af4a019a252673188e8ff5c8e82833f09dbb0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-mrbean \
mvn-com.fasterxml.jackson.module-jackson-module-mrbean \
mvn-com.fasterxml.jackson.module-jackson-module-mrbean-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-mrbean"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-org.ow2.asm-asm"

inherit rpm
