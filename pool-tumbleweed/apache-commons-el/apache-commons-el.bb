SUMMARY = "The Apache Commons Extension Language"
DESCRIPTION = "An implementation of standard interfaces and abstract classes for \
javax.servlet.jsp.el which is part of the JSP 2.0 specification."
LICENSE = "Apache-1.1"

PV = "1.0"

RPM_NAME = "apache-commons-el-1.0-3.7.noarch.rpm"
RPM_HASH = "630b7f760c2e57b66264c260d83b9892f052917f4780cdf55095fe3b1bc7c3ff731789dbe759d4b65041dd8971403a8136263ff7e3057aadf92a0239155e78b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-el \
commons-el \
jakarta-commons-el \
mvn-commons-el-commons-el \
mvn-commons-el-commons-el-pom- \
mvn-org.apache.commons-commons-el \
mvn-org.apache.commons-commons-el-pom- \
osgi-org.apache.commons.el"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm
