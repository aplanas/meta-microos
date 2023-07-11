SUMMARY = "Apache Tomcat JSP API implementation classes"
DESCRIPTION = "Apache Tomcat JSP API implementation classes version 2.3"
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-jsp-2_3-api-9.0.75-1.2.noarch.rpm"
RPM_HASH = "f41080ec4ce811e821502f2ef120067aed79dd48c510101768531d79aba533e8a75eeccf3ba49807aa220e5944b7202520a56903e595a83308491a4615e7442d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsp \
jsp23 \
mvn-org.apache.tomcat-tomcat-jsp-api \
mvn-org.apache.tomcat-tomcat-jsp-api-pom- \
mvn-org.eclipse.jetty.orbit-javax.servlet.jsp \
mvn-org.eclipse.jetty.orbit-javax.servlet.jsp-pom- \
osgi-org.apache.tomcat-jsp-api \
tomcat-jsp-2-3-api \
tomcat-jsp-2.3-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
mvn-org.apache.tomcat-tomcat-el-api \
mvn-org.apache.tomcat-tomcat-servlet-api \
update-alternatives"

inherit rpm
