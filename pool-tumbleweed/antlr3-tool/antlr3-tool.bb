SUMMARY = "ANother Tool for Language Recognition"
DESCRIPTION = "ANother Tool for Language Recognition, is a language tool \
that provides a framework for constructing recognizers, \
interpreters, compilers, and translators from grammatical \
descriptions containing actions in a variety of target languages."
LICENSE = "BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "antlr3-tool-3.5.3-2.4.noarch.rpm"
RPM_HASH = "1dca4c93440a5a864c57f37fe61a1870855c9cb71352c5b0314ccf439587f08339af504b40b865907670ded936496bca0416f922231e4fffbeb9890c52377726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr3-bootstrap-tool \
antlr3-tool \
config-antlr3-tool \
mvn-org.antlr-antlr \
mvn-org.antlr-antlr-pom- \
mvn-org.antlr-antlr3-maven-plugin \
mvn-org.antlr-antlr3-maven-plugin-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.antlr-ST4 \
mvn-org.antlr-antlr-runtime \
mvn-org.codehaus.plexus-plexus-compiler-api \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
