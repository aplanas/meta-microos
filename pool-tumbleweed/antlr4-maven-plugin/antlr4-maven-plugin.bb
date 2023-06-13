SUMMARY = "ANTLR 4 plugin for Apache Maven"
DESCRIPTION = "This package provides plugin for Apache Maven which can be used to \
generate ANTLR parsers during build."
LICENSE = "BSD-3-Clause"

PV = "4.9.3"

RPM_NAME = "antlr4-maven-plugin-4.9.3-1.10.noarch.rpm"
RPM_HASH = "d0250319e98b2e17394a775e76f4acca0dee1eb01eb5717469a3627b96199d1c244cebbe8841bef13aa7280e29310a00f8c2e50cba2b001a6d34785b47b4f157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr4-maven-plugin \
mvn(org.antlr:antlr4-maven-plugin) \
mvn(org.antlr:antlr4-maven-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.antlr:antlr4) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.apache.maven:maven-project) \
mvn(org.codehaus.plexus:plexus-compiler-api) \
mvn(org.sonatype.plexus:plexus-build-api)"

inherit rpm
