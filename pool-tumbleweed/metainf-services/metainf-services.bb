SUMMARY = "Small java library for generating META-INF/services files"
DESCRIPTION = "This package contains small Java library which can be used \
for automatic generation of META-INF/services files."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "metainf-services-1.9-1.10.noarch.rpm"
RPM_HASH = "ee6d3040b6112cefd9b555619b4d828171826f98b21b83d784c4b2cf82834c8532f404a7a60fabfd5c925fb1880365938f1862faaefd1137139a0c02657b7212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metainf-services \
mvn(org.kohsuke.metainf-services:metainf-services) \
mvn(org.kohsuke.metainf-services:metainf-services:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
