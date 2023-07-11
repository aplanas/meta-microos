SUMMARY = "The fcgi module for Jetty"
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
This package contains The fcgi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-fcgi-9.4.51-1.2.noarch.rpm"
RPM_HASH = "87d9a2c07fea90980c6e6bc39bef7a65d1dc5b46930bb59cec249b4bdce56235ac3047f594c5fd54457b94c1715677dd1bc860bc37ab9a25f89d4c5196c3973d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-fcgi \
mvn-org.eclipse.jetty.fcgi-fcgi-client \
mvn-org.eclipse.jetty.fcgi-fcgi-client-pom- \
mvn-org.eclipse.jetty.fcgi-fcgi-server \
mvn-org.eclipse.jetty.fcgi-fcgi-server-pom- \
osgi-org.eclipse.jetty.fcgi.client \
osgi-org.eclipse.jetty.fcgi.server"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.servlet-javax.servlet-api \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-proxy \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
