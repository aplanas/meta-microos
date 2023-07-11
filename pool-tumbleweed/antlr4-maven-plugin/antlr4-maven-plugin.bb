SUMMARY = "ANTLR 4 plugin for Apache Maven"
DESCRIPTION = "This package provides plugin for Apache Maven which can be used to \
generate ANTLR parsers during build."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "antlr4-maven-plugin-4.13.0-1.2.noarch.rpm"
RPM_HASH = "a3aad3457e501cf34c732419db0efc90adbd7856b49adec88e4b10d26943ddf29462d945004b464fcbbdbbdf20a882f92d125dc1d750c21e740e8b2bd92c9fcc"
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
