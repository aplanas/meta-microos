SUMMARY = "Istack-commons tools"
DESCRIPTION = "This package contains istack-commons tools."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-tools-3.0.7-4.5.noarch.rpm"
RPM_HASH = "874788b6601f12a925be41d290ba68021d313fc26a063e66f430979c53c2e11d10e5f27d3cdb9e95a86e973ad4520adf7bed2b4b5c88ce7830fd71178d6f84c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-tools \
mvn-com.sun.istack-istack-commons-tools \
mvn-com.sun.istack-istack-commons-tools-pom- \
osgi-com.sun.istack.commons-tools"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant"

inherit rpm
