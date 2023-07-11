SUMMARY = "ParaNamer Maven plugin"
DESCRIPTION = "This package contains the ParaNamer Maven plugin."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-maven-plugin-2.8-2.11.noarch.rpm"
RPM_HASH = "02ed9d3b27cc43957bdc92b4aeb675feef679ad60ff749f5929d13ef68c8128d44d996bb45e905f0bf1bacab0caad0a0498c252763988f6599648062148610a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-maven-plugin \
mvn-com.thoughtworks.paranamer-paranamer-maven-plugin-pom- \
paranamer-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.paranamer-paranamer-generator \
mvn-org.apache.maven-maven-plugin-api"

inherit rpm
