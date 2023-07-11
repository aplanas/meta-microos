SUMMARY = "Glassfish J2EE JSP API specification"
DESCRIPTION = "This project provides a container independent specification of JSP \
2.2. Note that this package doesn't contain implementation of this \
specification. See glassfish-jsp for one of implementations"
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.3.3"

RPM_NAME = "glassfish-jsp-api-2.3.3-4.4.noarch.rpm"
RPM_HASH = "677dd192305ad608f138478bd2c1ef5026f40f492d7d2d02e1489d8950c3b2b5533ab964aa010a14518000f06564ebff8394b2f29467ec6aaf22bb6717ca288d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp-api \
mvn-javax.servlet-jsp-api \
mvn-javax.servlet-jsp-api-pom- \
mvn-javax.servlet.jsp-javax.servlet.jsp-api \
mvn-javax.servlet.jsp-javax.servlet.jsp-api-pom- \
mvn-javax.servlet.jsp-jsp-api \
mvn-javax.servlet.jsp-jsp-api-pom- \
osgi-javax.servlet.jsp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.el-javax.el-api \
mvn-javax.servlet-javax.servlet-api"

inherit rpm
