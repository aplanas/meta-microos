SUMMARY = "The Apache Commons Extension Language"
DESCRIPTION = "An implementation of standard interfaces and abstract classes for \
javax.servlet.jsp.el which is part of the JSP 2.0 specification."
LICENSE = "Apache-1.1"

PV = "1.0"

RPM_NAME = "apache-commons-el-1.0-3.6.noarch.rpm"
RPM_HASH = "1fe55427aa1e3307dc7d8aec6bad0a0982241d5e922d112e09bb0908f769da842313c40a01852fdaac4cc5f26917c1bb7425f7e20df9e79ea2b7f79f1b35c6d4"
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
