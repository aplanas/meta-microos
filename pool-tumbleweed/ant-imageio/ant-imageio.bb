SUMMARY = "Optional imageio tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional imageio tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-imageio-1.10.14-1.1.noarch.rpm"
RPM_HASH = "851b5bb057dfe8eca331cd0319626b0f3575aed266052ea11787f8a2839c2745d4aca3b25aa31648bf2728c059423f756b929cfed7603a3c1967285918f76d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-imageio \
config-ant-imageio \
mvn-org.apache.ant-ant-imageio \
mvn-org.apache.ant-ant-imageio-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant"

inherit rpm
