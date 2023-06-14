SUMMARY = "Optional imageio tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional imageio tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-imageio-1.10.13-2.1.noarch.rpm"
RPM_HASH = "9d7fce1d7158cada27f2272e8156a94779e4547cb2c2fa51e0ccf0f64bf5a629165d6e81418a31b22750b1aa496e13ca5748a9dbc6ecb99a1ca61f0d77f041b9"
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
