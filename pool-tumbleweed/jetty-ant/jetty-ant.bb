SUMMARY = "The ant module for Jetty"
DESCRIPTION = " \
Jetty is a 100% Java HTTP Server and Servlet Container. This means that you \
do not need to configure and run a separate web server (like Apache) in order \
to use Java, servlets and JSPs to generate dynamic content. Jetty is a fully \
featured web server for static and dynamic content. Unlike separate \
server/container solutions, this means that your web server and web \
application run in the same process, without interconnection overheads \
and complications. Furthermore, as a pure java component, Jetty can be simply \
included in your application for demonstration, distribution or deployment. \
Jetty is available on all Java supported platforms. \
 \
This package contains The ant module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-ant-9.4.51-1.2.noarch.rpm"
RPM_HASH = "94ad82e90fa30bac823562fcc887a47c77efd6c643589f2399e852ba6ce124513b8a259d5f2e2bec6542e5e60cb752c10bf1eb4d3fb885d985f0c00fcdfcd303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-jetty-ant \
jetty-ant \
mvn-org.eclipse.jetty-jetty-ant \
mvn-org.eclipse.jetty-jetty-ant-pom- \
osgi-org.eclipse.jetty.ant"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.apache.ant-ant-launcher \
mvn-org.eclipse.jetty-jetty-annotations \
mvn-org.eclipse.jetty-jetty-plus \
mvn-org.eclipse.jetty-jetty-security \
mvn-org.eclipse.jetty-jetty-webapp"

inherit rpm
