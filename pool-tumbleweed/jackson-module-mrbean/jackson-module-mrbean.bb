SUMMARY = "Functionality for implementing interfaces and abstract types dynamically"
DESCRIPTION = "Mr Bean is an extension that implements support for 'POJO type materialization' \
ability for databinder to construct implementation classes for Java interfaces \
and abstract classes, as part of deserialization."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-mrbean-2.13.3-1.7.noarch.rpm"
RPM_HASH = "c9a8fa0d2ba77edab6d33f525629932dc7446aadc81c4b642c05e782da24b7d98fe1b3f3f317ab58306ea7842fdd10de7a8f5b76615570332673f159f8b2491a"
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
