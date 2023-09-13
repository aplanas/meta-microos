SUMMARY = "ParaNamer Generator"
DESCRIPTION = "This package contains the ParaNamer Generator."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-generator-2.8-3.1.noarch.rpm"
RPM_HASH = "4cbdd4d9b388864124ef2a6f99ee2a22af68909476ff72fb023a7e554c23b08437c81297cd325ff0984150ab688d09543c3f148b0fb72f8c4d2f3b1e711597b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-generator \
mvn-com.thoughtworks.paranamer-paranamer-generator-pom- \
paranamer-generator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.ow2.asm-asm"

inherit rpm
