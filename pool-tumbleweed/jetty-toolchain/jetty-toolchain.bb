SUMMARY = "Jetty Toolchain main POM file"
DESCRIPTION = "Jetty Toolchain main POM file"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.7"

RPM_NAME = "jetty-toolchain-1.7-1.21.noarch.rpm"
RPM_HASH = "fe184f471c674aa525daa0a4f17cec39bb87b75e74f13cdcf02338c2dfb5de94c6830b040594d8aa34e86636b66804bb531bd77eb9ce2c53578d91b8348d27fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-toolchain \
mvn-org.eclipse.jetty.toolchain-jetty-toolchain-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
