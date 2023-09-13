SUMMARY = "The openid module for Jetty"
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
This package contains The openid module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-openid-9.4.51-2.1.noarch.rpm"
RPM_HASH = "3b07bc7911d1fa208db1c9d23ac4c987b044ca80cd27d904fbd490ecc525116d437740e87b9a46933aaebed9004065b0e9f1faf33301196f0732a32ca912230a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-openid \
mvn-org.eclipse.jetty-jetty-openid \
mvn-org.eclipse.jetty-jetty-openid-pom- \
osgi-org.eclipse.jetty.openid"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.eclipse.jetty-jetty-security \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-util-ajax"

inherit rpm
