SUMMARY = "Apache Tomcat Servlet API implementation classes"
DESCRIPTION = "Apache Tomcat Servlet API implementation classes version 3.1"
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-servlet-4_0-api-9.0.75-1.2.noarch.rpm"
RPM_HASH = "defe99924e55467aff4eeb67146f1ff9246437ef104f76569f26618bfee2766d280b5cabbf2933bddda354f21b30746fb902561aba8f83281c3061deb885298b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.tomcat-tomcat-servlet-api \
mvn-org.apache.tomcat-tomcat-servlet-api-pom- \
mvn-org.mortbay.jetty-servlet-api \
mvn-org.mortbay.jetty-servlet-api-pom- \
osgi-org.apache.tomcat-servlet-api \
servlet \
servlet31 \
servlet7 \
tomcat-servlet-4-0-api \
tomcat-servlet-4.0-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
