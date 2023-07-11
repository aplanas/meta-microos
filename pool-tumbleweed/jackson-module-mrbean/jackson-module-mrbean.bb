SUMMARY = "Functionality for implementing interfaces and abstract types dynamically"
DESCRIPTION = "Mr Bean is an extension that implements support for 'POJO type materialization' \
ability for databinder to construct implementation classes for Java interfaces \
and abstract classes, as part of deserialization."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-mrbean-2.13.3-1.8.noarch.rpm"
RPM_HASH = "bf124f8312cb425a3caa5bad60f6aa54e9609bb3e4c1dce7b4eea4a18861ab17124447abb36a885a87028c785c0296b1393b4a039beff5f02c79b50c88d3402c"
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
