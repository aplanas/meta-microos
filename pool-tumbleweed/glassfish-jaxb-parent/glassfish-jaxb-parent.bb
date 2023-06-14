SUMMARY = "JAXB parent POM"
DESCRIPTION = "This package contains parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-parent-2.3.1-4.4.noarch.rpm"
RPM_HASH = "42c928d95e2bb0a0ff605a00454bc7bcffe7f0cf5bf1b655f44f702b63c8ac76bba49603b5674a0704e2e6c70fc2c398f86a37da84c6088a7540e2713e9c76bf"
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
