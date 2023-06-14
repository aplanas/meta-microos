SUMMARY = "Apache Tomcat Servlet API implementation classes"
DESCRIPTION = "Apache Tomcat Servlet API implementation classes version 3.1"
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-servlet-4_0-api-9.0.75-1.1.noarch.rpm"
RPM_HASH = "3d67ff4f5ce4cdcca79dede53f3606c7f8ba24cf7512529992bf4b750ac5aab053e19f3e4581b1f5dbbe9a55e4c306a9fe3f0779f04a6f2f6aa485555334b65a"
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

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
