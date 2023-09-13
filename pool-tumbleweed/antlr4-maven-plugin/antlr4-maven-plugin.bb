SUMMARY = "ANTLR 4 plugin for Apache Maven"
DESCRIPTION = "This package provides plugin for Apache Maven which can be used to \
generate ANTLR parsers during build."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "antlr4-maven-plugin-4.13.0-2.1.noarch.rpm"
RPM_HASH = "cd6b4ad26fbc1e51fb162d2b4f0085c07a5a315af7c33d65db5425c3c73fc49f453570ba1b31c9a0d9bf97e5a8a284806ed5c652a7003788cd33b38163ce44fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr4-maven-plugin \
mvn-org.antlr-antlr4-maven-plugin \
mvn-org.antlr-antlr4-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.antlr-antlr4 \
mvn-org.codehaus.plexus-plexus-compiler-api \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
