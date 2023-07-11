SUMMARY = "Optional imageio tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional imageio tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-imageio-1.10.13-2.2.noarch.rpm"
RPM_HASH = "523e7282eec473ca692b208844fd607846aae904cb5138f07e3cb42858717da0697679e2317b82e33bdc4366b30d04f2184e9762f39f2780fef1f1ef0e98b13e"
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
