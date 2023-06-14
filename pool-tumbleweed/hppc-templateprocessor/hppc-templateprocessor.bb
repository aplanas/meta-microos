SUMMARY = "HPPC Template Processor"
DESCRIPTION = "Template Processor and Code Generation for HPPC."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "hppc-templateprocessor-0.7.1-3.10.noarch.rpm"
RPM_HASH = "6ff45054485595100418d1ad0a9af9d35bb86aff9a8995b017ff67601209d91a9624ec9e193c758b44689bebbbb4359904e5e4e83e8c8af560cb89e19106f9f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hppc-templateprocessor \
mvn-com.carrotsearch-hppc-template-processor \
mvn-com.carrotsearch-hppc-template-processor-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava \
mvn-junit-junit \
mvn-org.antlr-antlr4 \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.velocity-velocity"

inherit rpm
