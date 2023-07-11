SUMMARY = "HPPC Template Processor"
DESCRIPTION = "Template Processor and Code Generation for HPPC."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "hppc-templateprocessor-0.7.1-3.11.noarch.rpm"
RPM_HASH = "b89d8511ad574799d8049d9a64a8bf357f8cddaffc47363bcc52d69393d7c8e7083f5f58f00fc1e5ff7ef3821e79213c77a224e6439c4d19063b517903227b48"
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
