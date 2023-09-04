SUMMARY = "Functionality for implementing interfaces and abstract types dynamically"
DESCRIPTION = "Mr Bean is an extension that implements support for 'POJO type materialization' \
ability for databinder to construct implementation classes for Java interfaces \
and abstract classes, as part of deserialization."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-mrbean-2.15.2-1.1.noarch.rpm"
RPM_HASH = "a58e6a52ce90c2ac20d14d8c50143048d3d76cf187b702350ecbbd24396bad7d3b6bca7fd1abdcc70f0b0a2b25c9197dc6f5ce364d947dd3156e584f03f11b3f"
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
