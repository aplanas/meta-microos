SUMMARY = "ParaNamer Generator"
DESCRIPTION = "This package contains the ParaNamer Generator."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-generator-2.8-2.11.noarch.rpm"
RPM_HASH = "e777d44e6a8d1be4e059c04e910e9f43816b42f49450e808d54ea481904641db5131656ff397a5ad6311aaeede3933e92fb78f938dfa80d28dcf5a75bb0184df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-generator \
mvn-com.thoughtworks.paranamer-paranamer-generator-pom- \
paranamer-generator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.ow2.asm-asm"

inherit rpm
