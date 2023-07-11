SUMMARY = "JAXB parent POM"
DESCRIPTION = "This package contains parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-parent-2.3.1-4.5.noarch.rpm"
RPM_HASH = "3e862bf13555d82970a7c3e4c30ee8436dca455e3ba7840cc36fb2ef3a651bd6c2ceafecc268ce3131fda153b2a680c1e3e9d62a8a6b40e584b7a0876de7e392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-parent \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind-jaxb-bom-ext-pom- \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-dependency-plugin \
mvn-org.apache.maven.plugins-maven-enforcer-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
