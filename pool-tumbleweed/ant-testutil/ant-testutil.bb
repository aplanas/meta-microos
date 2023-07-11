SUMMARY = "Test utility classes for ant"
DESCRIPTION = "Test utility tasks for ant-antlr."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-testutil-1.10.13-2.2.noarch.rpm"
RPM_HASH = "706c70e12eadbae62627723a6bebd6b83f218b7013a93c80405b4d9a3591c7dd896962cb2cc04c1e4d52aebb4306e79e926c901f068eb57db451d2aaa12ad13b"
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
