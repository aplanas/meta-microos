SUMMARY = "Test utility classes for ant"
DESCRIPTION = "Test utility tasks for ant-antlr."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-testutil-1.10.14-1.1.noarch.rpm"
RPM_HASH = "bdaf3f22da92636757354edcebccabaa7c4f4684d2fbde17e0f2fc4bd8d9240dd9af5b42fa8f547fdc93cddcdab1b124598af5039758971811eafab84fc99e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-testutil \
config-ant-testutil \
mvn-org.apache.ant-ant-testutil \
mvn-org.apache.ant-ant-testutil-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
junit4 \
mvn-junit-junit \
mvn-org.apache.ant-ant"

inherit rpm
