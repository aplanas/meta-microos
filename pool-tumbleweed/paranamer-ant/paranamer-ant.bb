SUMMARY = "ParaNamer Ant"
DESCRIPTION = "This package contains the ParaNamer Ant tasks."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-ant-2.8-2.10.noarch.rpm"
RPM_HASH = "52fe37ce52a87712c27f0c3c2de87ea4ae300c305d2a87a2c2d08138926cba3a6cef809f8294955c441810aa58a018ee6505dda085ddb7a959160c8bfabc1990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.thoughtworks.paranamer:paranamer-ant) \
mvn(com.thoughtworks.paranamer:paranamer-ant:pom:) \
paranamer-ant"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.thoughtworks.paranamer:paranamer-generator) \
mvn(org.apache.ant:ant)"

inherit rpm
