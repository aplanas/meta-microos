SUMMARY = "ParaNamer Maven plugin"
DESCRIPTION = "This package contains the ParaNamer Maven plugin."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-maven-plugin-2.8-3.1.noarch.rpm"
RPM_HASH = "db1db95dc0fd8a7dcc5c1c68d365ac652b80e8073082bf9b54ff68ca610828f615e81ea0d4655448536a83d8ef75dddac07c8067d94b8ae66c92de175274197c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-maven-plugin \
mvn-com.thoughtworks.paranamer-paranamer-maven-plugin-pom- \
paranamer-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.paranamer-paranamer-generator \
mvn-org.apache.maven-maven-plugin-api"

inherit rpm
