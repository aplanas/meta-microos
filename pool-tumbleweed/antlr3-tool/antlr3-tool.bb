SUMMARY = "ANother Tool for Language Recognition"
DESCRIPTION = "ANother Tool for Language Recognition, is a language tool \
that provides a framework for constructing recognizers, \
interpreters, compilers, and translators from grammatical \
descriptions containing actions in a variety of target languages."
LICENSE = "BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "antlr3-tool-3.5.3-2.3.noarch.rpm"
RPM_HASH = "2d178672fca5ffa12d750959f5c0b72135f1e5dfd1b08f9436f57512a139126fb8ccc18d542fe00dc6782a017055e8f1f2c3ef3248519dd7d664f296586dc0bd"
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
