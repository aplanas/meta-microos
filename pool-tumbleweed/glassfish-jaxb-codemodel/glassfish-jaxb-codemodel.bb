SUMMARY = "Codemodel Core"
DESCRIPTION = "The core functionality of the CodeModel java source code generation \
library."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-codemodel-2.3.1-4.5.noarch.rpm"
RPM_HASH = "16ad4f7e1e0de5857bbdab9335ec860d05d3197d4f97c1cf00c2c4211412f95ebe2142f0a678821a8af9cea07ec4ac9dd13fa7126b63812a23c24c764350dab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-codemodel \
mvn-org.glassfish.jaxb-codemodel \
mvn-org.glassfish.jaxb-codemodel-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
