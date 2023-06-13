SUMMARY = "Apache Tomcat JSP API implementation classes"
DESCRIPTION = "Apache Tomcat JSP API implementation classes version 2.3"
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-jsp-2_3-api-9.0.75-1.1.noarch.rpm"
RPM_HASH = "805cecb3841a11087a22951aa1bf982fe4e95b2fab9a500752a6a0dc18b44140b2e10139d860f03de2f682b71c2302111037124c6c9e8e7b25dac3c7be1e8308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsp \
jsp23 \
mvn(org.apache.tomcat:tomcat-jsp-api) \
mvn(org.apache.tomcat:tomcat-jsp-api:pom:) \
mvn(org.eclipse.jetty.orbit:javax.servlet.jsp) \
mvn(org.eclipse.jetty.orbit:javax.servlet.jsp:pom:) \
osgi(org.apache.tomcat-jsp-api) \
tomcat-jsp-2.3-api \
tomcat-jsp-2_3-api"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
mvn(org.apache.tomcat:tomcat-el-api) \
mvn(org.apache.tomcat:tomcat-servlet-api) \
update-alternatives"

inherit rpm
